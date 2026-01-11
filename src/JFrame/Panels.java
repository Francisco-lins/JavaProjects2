package JFrame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Panels {
    public static void main(String[] args) {

        ImageIcon thumbsup = new ImageIcon("thumbsup2.png");

        JLabel label = new JLabel();
        label.setText("thumbs up");
        label.setIcon(thumbsup);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0,0,75,75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(null);
        //redPanel.add(label);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(null);
        //bluePanel.add(label);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,250,300,300);
        greenPanel.setLayout(null);
        greenPanel.add(label);
        //greenPanel.remove(0);

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.setSize(750,750);
        window.setVisible(true);
        window.add(redPanel);
        window.add(bluePanel);
        window.add(greenPanel);



    }
}
