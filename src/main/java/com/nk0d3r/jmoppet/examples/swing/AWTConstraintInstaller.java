package com.nk0d3r.jmoppet.examples.swing;

import com.nk0d3r.jmoppet.model.MoppetModel;
import com.nk0d3r.jmoppet.setup.MoppetInstaller;

import java.awt.*;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;

public class AWTConstraintInstaller implements MoppetInstaller{
    public void install(){

        //define constraint
        MoppetModel moppet = new MoppetModel();

        moppet.define(MouseEvent.class, new ExampleConstraint());

        //install rule check activator
        long eventMask = AWTEvent.MOUSE_EVENT_MASK;
        Toolkit.getDefaultToolkit().addAWTEventListener(new AWTEventListener() {
            public void eventDispatched(AWTEvent e) {
                moppet.checkConstraints(e);
            }
        }, eventMask);
    }

}
