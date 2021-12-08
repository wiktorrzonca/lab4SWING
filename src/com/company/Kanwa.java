package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Kanwa extends JFrame {

    private char key;

    @Override
    public void paint(Graphics graphics){
        Point mouse = getMousePosition();
        Graphics2D g2D = (Graphics2D)graphics;
        if (key == 'o')g2D.drawOval((int)mouse.getX(),(int) mouse.getY(),50,50);
        if (key == 'k')g2D.drawRect((int)mouse.getX(),(int) mouse.getY(),50,50);
    }

    Kanwa() {

        this.setTitle("kanwa");
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLayout(null);
        this.setFocusable(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                key = e.getKeyChar();
                repaint();
            }
        });
    }
}
