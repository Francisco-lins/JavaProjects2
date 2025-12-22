package JFrame;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class Main{
    public static void main(String[] args){
        int x = 800, y = 600;
        String title = "Minecraft 2";

        JFrame frame = new JFrame(); // Creates a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits out of the application
        frame.setResizable(false); // Makes the window not resizable
        frame.setTitle(title); // Sets the title
        frame.setSize(x,y); // Sets the window dimensions
        frame.setVisible(true); // Makes the frame visible

        ImageIcon icon = new ImageIcon("logo.png"); // Creates the Icon's Image
        frame.setIconImage(icon.getImage()); // Changes the Icon's image
        frame.getContentPane().setBackground(new Color(123,50,250)); // Changes the background color



    }
}