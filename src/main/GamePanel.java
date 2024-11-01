package main;

import Inputs.KeyboardInputs;
import Inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;


public class GamePanel extends JPanel {

    private int xDelta = 100;
    private int yDelta = 100;
    private MouseInputs mouseInputs;

    public GamePanel() {
        mouseInputs = new MouseInputs(this);
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
        addKeyListener(new KeyboardInputs(this));
    }

    public void changeXDelta(int value){
        xDelta += value;
        repaint();
    }

    public void changeYDelta(int value){
        yDelta += value;
        repaint();
    }

    public void setRecPos(int x, int y){
        xDelta += x;
        yDelta += y;
        repaint();
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(100,  100, 200, 50);

    }
}