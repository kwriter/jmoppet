package com.nk0d3r.jmoppet.examples.swing;

import com.nk0d3r.jmoppet.model.MoppetConstraint;

public class ExampleConstraint implements MoppetConstraint {

    @Override
    public boolean check(Object event) {
        return false;
    }

    @Override
    public void repair(Object event) {

    }
}
