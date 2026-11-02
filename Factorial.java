
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Factorial extends JFrame implements ActionListener

{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1;

    Factorial()
    {
        setTitle("Factorial Calculator");
        setSize(400,300);
        setLayout(new FlowLayout());

        l1 = new JLabel("First Number:");
        l2 = new JLabel("Second Number:");
        l3 = new JLabel("Third Number:");
        l4 = new JLabel("Factorial:");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);

        b1 = new JButton("Find Factorial");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);

        b1.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = Integer.parseInt(t3.getText());

        int small = a;

        if(b < small)
            small = b;

        if(c < small)
            small = c;

        if(small < 0)
        {
            JOptionPane.showMessageDialog(this,"Enter positive numbers");
            return;
        }

        long fact = 1;

        for(int i = 1; i <= small; i++)
        {
            fact = fact * i;
        }

        t4.setText(String.valueOf(fact));
    }

    public static void main(String args[])
    {
        new Factorial();
    }
}
