package com.nk0d3r.jmoppet.examples.swing;

import javax.swing.*;
import java.awt.*;

public class SwingButtonExample {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setLayout(new BorderLayout());
        JButton btn = new JButton("test");
        frame.add(btn);
        frame.setVisible(true);
    }
}
