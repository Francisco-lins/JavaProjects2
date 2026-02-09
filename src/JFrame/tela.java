package JFrame;
import javax.swing.*;

public class tela
{
    public static void main(String[] args)
    {
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("cafe.jpg"));
        label.setVisible(true);



        JFrame screen = new JFrame();
        screen.setVisible(true);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setSize(label.getIcon().getIconWidth(),label.getIcon().getIconHeight());
        screen.setResizable(false);
        screen.add(label);

    }


}
