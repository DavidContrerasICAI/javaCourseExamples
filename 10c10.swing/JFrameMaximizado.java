import java.awt.*;
import javax.swing.*;

public class JFrameMaximizado extends JFrame
{
    public static void main(String args[])
    {
        new JFrameMaximizado();
    }

    public JFrameMaximizado()
    {
        this.setLayout(new FlowLayout());
        this.add(new JButton("Bot�n 1"));
        this.add(new JButton("Bot�n 2"));
        this.add(new JButton("Bot�n 3"));

        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        this.setUndecorated(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
