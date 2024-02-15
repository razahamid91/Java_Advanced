package GUI;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

class Calculator extends JFrame{
    Container c;
     JLabel label1, label2;

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
        label2.setBounds(50,100,150,50);
        c.add(label2);

        txt1=new JTextField(0);
        txt1.setBounds(250,50,150,50);
        c.add(txt1);

        txt2=new JTextField(0);
        txt2.setBounds(250,100,150,50);
        c.add(txt2);

        add=new JButton("+");
        add.setBounds(250,250,50,50);
        c.add(add);

        sub=new JButton("-");
        sub.setBounds(200,250,50,50);
        c.add(sub);

        mul=new JButton("*");
        mul.setBounds(350,250,50,50);
        c.add(mul);


        div=new JButton("/");
        div.setBounds(400,250,50,50);
        c.add(div);



        setVisible(true);

    }
}

public class MyCalculator {

    public static void main(String[] args){

        Calculator c = new Calculator();



    }
    
}
