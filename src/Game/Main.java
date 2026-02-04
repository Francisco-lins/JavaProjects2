package Game;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        int tempx = 100;

        ImageIcon stickmanpng = new ImageIcon("stickman.png");

        JLabel stickman = new JLabel();
        stickman.setIcon(stickmanpng);
        stickman.setBounds(100,100,32,32);
        stickman.setVisible(true);
        stickman.setVerticalAlignment(JLabel.CENTER);
        stickman.setHorizontalAlignment(JLabel.CENTER);


        GameWindow game = new GameWindow(700,700, stickman);
        game.startWindow();
        game.add(stickman);
    }
}
