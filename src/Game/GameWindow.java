package Game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameWindow extends JFrame
{
    private int WINDOW_WIDTH;
    private int WINDOW_HEIGHT;
    private JLabel mainLabel;

    // Sets everything up
    GameWindow(int width, int height, JLabel label)
    {
        this.WINDOW_HEIGHT = height;
        this.WINDOW_WIDTH = width;
        this.mainLabel = label;

        // Setting everything up
        this.setBounds(0,0,this.WINDOW_WIDTH,this.WINDOW_HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Starts the window
    public void startWindow()
    {
        this.setVisible(true);
        keyBindings();

    }

    void setLabel(JLabel label)
    {
        this.mainLabel = label;
    }

    // Changes the position of a Label
    static void pos(JLabel jlabel ,int x, int y)
    {
        jlabel.setBounds(jlabel.getX() + x, jlabel.getY() + y, jlabel.getWidth(), jlabel.getHeight());
    }
    private void keyBindings()
    {
        InputMap im = this.mainLabel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap am = this.mainLabel.getActionMap();

        im.put(KeyStroke.getKeyStroke("W"), "up");
        am.put("up", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                pos(mainLabel, 0, -5);
            }
        });

        im.put(KeyStroke.getKeyStroke("S"), "down");
        am.put("down", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                pos(mainLabel, 0, 5);
            }
        });

        im.put(KeyStroke.getKeyStroke("D"), "right");
        am.put("right", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                pos(mainLabel, 5, 0);
            }
        });

        im.put(KeyStroke.getKeyStroke("A"), "left");
        am.put("left", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                pos(mainLabel, -5, 0);
            }
        });
    }
}
