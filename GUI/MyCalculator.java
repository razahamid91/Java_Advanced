package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

class Calculator extends JFrame implements ActionListener{
    Container c;
    JLabel label1, label2, labelResult;
    JTextField txt1, txt2;
    JButton add, sub, mul , div;

    Calculator(){
        setTitle("My Calculator");
        setBounds(100,100,800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        c=getContentPane();
        c.setLayout(null);
        // set label
        label1=new JLabel("first number :");
        label1.setBounds(50,50,150,50);
        c.add(label1);
        label2=new JLabel("second number :");
        label2.setBounds(50,150,150,50);
        c.add(label2);
        labelResult=new JLabel("Result:");
        labelResult.setBounds(100,400,150,50);
        labelResult.setForeground(Color.RED); // Set labelResult text color to red
        c.add(labelResult);
        txt1=new JTextField(0);
        txt1.setBounds(250,50,150,50);
        c.add(txt1);
        txt2=new JTextField(0);
        txt2.setBounds(250,150,150,50);
        c.add(txt2);
        add=new JButton("+");
        add.setBounds(100,250,50,50);
        c.add(add);
        add.addActionListener(this);
        sub=new JButton("-");
        sub.setBounds(250,250,50,50);
        c.add(sub);
        sub.addActionListener(this);
        mul=new JButton("*");
        mul.setBounds(350,250,50,50);
        c.add(mul);
        mul.addActionListener(this);
        div=new JButton("/");
        div.setBounds(450,250,50,50);
        c.add(div);
        div.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        try {
            int x=Integer.parseInt(txt1.getText());
            int y=Integer.parseInt(txt2.getText());
            int z=0;
            if(e.getSource()==add)
                z=x+y;
            else if(e.getSource()==sub)
                z=x-y;
            else if(e.getSource()==mul)
                z=x*y;
            else if(e.getSource()==div) {
                if (y == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                z = x / y;
            }
            labelResult.setText("Result: " + z);
        } catch(NumberFormatException ee){
            labelResult.setText("Result: enter only numeric only...");
        } catch(ArithmeticException ee){
            labelResult.setText("Result: " + ee.getMessage());
        }
    }
}

public class MyCalculator {
    public static void main(String[] args){
        Calculator c = new Calculator();
    }
}