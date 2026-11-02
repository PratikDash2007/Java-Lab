
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ColourGame extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4,b5;
    
    ColourGame()
    {
        setTitle("Colour Identification");
        setSize(400,300);
        setLayout(new FlowLayout());

        b1 = new JButton("Red");
        b2 = new JButton("Blue");
        b3 = new JButton("Green");
        b4 = new JButton("Orange");
        b5 = new JButton("Yellow");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        JButton b = (JButton)e.getSource();
        JOptionPane.showMessageDialog(this,
        "You selected " + b.getText() + " colour!");
    }

    public static void main(String args[])
    {
        new ColourGame();
    }
}
