package JFrame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class Practice {
    public static void main(String[] args){
        int wHeight = 600;
        int wWidth = 800;

        // Label
        JLabel label = new JLabel();
        ImageIcon image = new ImageIcon("emoji_middle_finger.png");

        label.setText("calaboca");
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setFont(new Font("Cascadia Mono", Font.BOLD, 20));
        label.setForeground(Color.BLACK);
        label.setIconTextGap(-25);

        label.setIcon(image);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);





        JFrame window = new JFrame();

        window.setVisible(true);
        window.setSize(wWidth, wHeight);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("calaboca vitor");
        window.add(label);


        ImageIcon logo = new ImageIcon("cafe.jpg");

        window.setIconImage(logo.getImage());


        window.getContentPane().setBackground(new Color(127, 46, 239));

    }
}
