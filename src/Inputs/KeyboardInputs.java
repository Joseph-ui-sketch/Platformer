package Inputs;

import main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {



    private GamePanel gamePanel;

    public KeyboardInputs(GamePanel gamePanel){
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getExtendedKeyCode()){

            case KeyEvent.VK_W -> gamePanel.changeYDelta(-5);
            case KeyEvent.VK_A -> gamePanel.changeXDelta(-5);
            case KeyEvent.VK_S -> gamePanel.changeXDelta(5);
            case KeyEvent.VK_D -> gamePanel.changeYDelta(5);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
