
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;

    Calculator()
    {
        setTitle("Simple Calculator");
        setSize(400,300);
        setLayout(new FlowLayout());

        l1 = new JLabel("First Number:");
        l2 = new JLabel("Second Number:");
        l3 = new JLabel("Result:");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        b1 = new JButton("Add");
        b2 = new JButton("Subtract");
        b3 = new JButton("Multiply");
        b4 = new JButton("Divide");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        double c = 0;

        if(e.getSource() == b1)
            c = a + b;

        if(e.getSource() == b2)
            c = a - b;

        if(e.getSource() == b3)
            c = a * b;

        if(e.getSource() == b4)
        {
            if(b == 0)
            {
                JOptionPane.showMessageDialog(this,"Cannot divide by zero");
                return;
            }
            c = a / b;
        }

        t3.setText(String.valueOf(c));
    }

    public static void main(String args[])
    {
        new Calculator();
    }
}
