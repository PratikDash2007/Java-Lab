
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class NumberInfo extends JFrame implements ActionListener
{
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1;

    NumberInfo()
    {
        setTitle("Number Information");
        setSize(400,250);
        setLayout(new FlowLayout());

        l1 = new JLabel("Enter a Number:");
        l2 = new JLabel("Result:");

        t1 = new JTextField(10);
        t2 = new JTextField(25);

        b1 = new JButton("Check");

        add(l1);
        add(t1);
        add(b1);
        add(l2);
        add(t2);

        b1.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        int n = Integer.parseInt(t1.getText());
        String result = "";

        if(n > 0)
            result = "Positive";
        else if(n < 0)
            result = "Negative";
        else
            result = "Zero";

        if(n % 2 == 0)
            result = result + ", Even";
        else
            result = result + ", Odd";

        int count = 0;

        if(n > 1)
        {
            for(int i = 1; i <= n; i++)
            {
                if(n % i == 0)
                    count++;
            }
        }

        if(count == 2)
            result = result + ", Prime";
        else
            result = result + ", Not Prime";

        int temp = Math.abs(n);
        int rev = 0;

        while(temp > 0)
        {
            int r = temp % 10;
            rev = rev * 10 + r;
            temp = temp / 10;
        }

        if(Math.abs(n) == rev)
            result = result + ", Palindrome";
        else
            result = result + ", Not Palindrome";

        t2.setText(result);
    }

    public static void main(String args[])
    {
        new NumberInfo();
    }
}
