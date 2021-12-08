package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import static java.lang.Math.abs;

public class MyFrame extends JFrame implements MouseListener {

    private int x=0;
    private int y=0;
    JButton resetButton;
    JButton runningButton;
    JPanel zone;
    MyFrame() {
        zone = new JPanel();
        zone.setBounds(350,0,150,500);
        zone.setBackground(Color.red);
        resetButton = new JButton("reset");
        resetButton.setBounds(0,0,100,100);
        resetButton.addActionListener(e -> {
            x=200;
            y=200;
            runningButton.setBounds(200,200,100,100);
            zone.setBackground(Color.red);
        });
        runningButton = new JButton("click me!");
        runningButton.setBounds(200,200,100,100);
        runningButton.addMouseListener(this);
        this.setTitle("laboratorium 4");
        this.setSize(515, 540);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(resetButton);
        this.add(runningButton);
        this.add(zone);


    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==runningButton){zone.setBackground(Color.green);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==runningButton && x<=350){
            Random rand = new Random();

            x=0;
            y=0;

            while(x<100 && y<100){
                x = rand.nextInt(400);
                y = rand.nextInt(400);
            }

            runningButton.setBounds(x, y, 100, 100);

        }
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
