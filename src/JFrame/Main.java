package JFrame;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

public class Main{
    public static void sleep(long ms) throws InterruptedException{
        try{
            Thread.sleep(ms);
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println("Error: " + e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        /*
        * The Text Label Follows the Image Label.
        * If you move The Image, you move the Text.
        * The text moves with base on the Image
        * The Text follows the image, but the image does not follow the text
        * */


        int width = 800, height = 800;
        String title = "Minecraft 2";
        ImageIcon backgroundImage = new ImageIcon("emoji_middle_finger.png"); // Makes the Image
        Border border = BorderFactory.createLineBorder(Color.RED, 5);

        // Label
        JLabel label = new JLabel(); // Creates the label
        label.setText("tmnc kkk"); // Sets the label text
        label.setIcon(backgroundImage); // Sets the label Icon
        label.setHorizontalTextPosition(JLabel.CENTER); // Horizontal Text Position
        label.setVerticalTextPosition(JLabel.TOP); // Vertical Text Position
        label.setForeground(Color.WHITE); // Sets the Text Color
        label.setIconTextGap(-25);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // Sets the text font
        label.setBorder(border); // Sets the border in the frame
        label.setVerticalAlignment(JLabel.CENTER); // Sets the image to the center vertically
        label.setHorizontalAlignment(JLabel.CENTER); // Sets the image to the center Horizontally
        //label.setBounds(width/4,height/4,width/2,height/2); // Sets the label x and y

        // Frame
        JFrame frame = new JFrame(); // Creates a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits out of the application
        frame.setVisible(true); // Makes the frame visible
        frame.setSize(width,height); // Sets the frame dimensions
        frame.setResizable(false); // Makes the frame not resizable
        frame.setTitle(title); // Sets the title
        //frame.setLayout(null);
        frame.add(label);
        //frame.pack();

        // Changes the Frame's Icon and Background
        ImageIcon icon = new ImageIcon("logo.png"); // Creates the Icon's Image
        frame.setIconImage(icon.getImage()); // Changes the Icon's image
        frame.getContentPane().setBackground(new Color(75,0,0)); // Changes the background color
    }
}