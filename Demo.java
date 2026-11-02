import java.awt.Button;
import java.awt.Frame;

public class Demo
{
    private Demo() 
    {
    Frame frame = new Frame("AWT Frame and Button");
    Button button = new Button("I am a Button");
    button.setBounds (30,50,150,50);
    frame.add(button);
    frame.setSize(300,300);
    frame.setLayout(null);
    frame.setVisible(true);
    }

    public static void main(String args[])
    {
        new Demo();
    }
}