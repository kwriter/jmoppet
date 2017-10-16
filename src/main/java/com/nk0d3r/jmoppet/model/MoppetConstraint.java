package com.nk0d3r.jmoppet.model;

/**
 * Provides methods to check the application environment and the event that triggered the constraint check
 * @param <EventType> generic type defining the event class to be used (e.G. for android this would be android.content.Intent, in a Swing app, it would be an AWTEvent)
 */
public interface MoppetConstraint<EventType> {

    /**
     * checks if the requirements to validate this constraint are satisfied which means e.g. the event happened on a certain component and the system is in a certainstate
     *
     * @return true if valdiation can occur
     */
    public boolean check(EventType event);

    /**
     * validate this constraint. which means that code is executed that checks a constraint and corrects it if possible
     *
     * @param event
     */
    public void repair(EventType event);
}
