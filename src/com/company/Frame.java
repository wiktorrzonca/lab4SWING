package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class Frame extends JFrame implements MouseListener {
    JButton run = new JButton("Run");
    private int runX = 200;
    private int runY = 200;
    JButton reset = new JButton("Reset");
    public char key;

    @Override
    public void paint(Graphics g) {
        Point mouse = getMousePosition();
        Graphics2D g2D = (Graphics2D) g;
        if (key == 'o') g2D.drawOval((int) mouse.getX(), (int) mouse.getY(), 70, 70);
        if (key == 'k') g2D.drawRect((int) mouse.getX(), (int) mouse.getY(), 70, 70);
        run.setBounds(runX, runY, 100, 100);
        reset.setBounds(5, 5, 100, 100);
    }

    Frame() {

        reset.addActionListener(e ->
        {
            runY = 200;
            runX = 200;
            run.setBounds(runY, runX, 100, 100);
        });

    }
}

