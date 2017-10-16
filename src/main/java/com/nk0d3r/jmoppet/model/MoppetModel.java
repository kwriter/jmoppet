package com.nk0d3r.jmoppet.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * reflects a formal application model which can be incomplete
 * the model is extended by annotations in the source code
 *
 * a model is made of rules which are each made of four parts:
 *  - name - name of the rule
 *  - trigger - a trigger is defined via annotation and will call the model check
 *  - model check - checks if a part of the model works in acceptable limits
 *      - model checks can occure on events or scheduled
 *  - recovery - a method called to recover from a failed state
 */
public class MoppetModel {
    HashMap<Class<?>, ArrayList<MoppetConstraint>> constraints;

    public MoppetModel() {
        this.constraints = new HashMap<>();
    }

    public void checkConstraints(Object event){
        ArrayList<MoppetConstraint> specificConstraints;
        specificConstraints = ensureConstraintListForEventType(event.getClass());
        for(MoppetConstraint constraint : specificConstraints){
            if( ! constraint.check(event)){
                continue;
            }
            constraint.repair(event);
        }
    }

    public void define(Class<?> eventType, MoppetConstraint constraint) {
        ArrayList<MoppetConstraint> specificConstraints;
        specificConstraints = ensureConstraintListForEventType(eventType);
        specificConstraints.add(constraint);
    }

    private ArrayList<MoppetConstraint> ensureConstraintListForEventType(Class<?> eventType) {
        if(this.constraints.containsKey(eventType)){
            return constraints.get(eventType);
        }
        final ArrayList<MoppetConstraint> constraintList = new ArrayList<MoppetConstraint>();
        this.constraints.put(eventType, constraintList);
        return constraintList;
    }
}
