package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;

public class PracticeQ1 {

     public static void main(String[] args) {
        
        JFrame jf = new JFrame("demo");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(500, 300, 800, 600);

        // for giving whole container properties
        Container contr = jf.getContentPane();

         JTextField jtxt = new JTextField();
        jtxt.setBounds(100,200,300,50);
        jtxt.setText("text box1...");

        Font f = new Font("arial" ,Font.BOLD,30);
        jtxt.setFont(f);

        jtxt.setForeground(Color.blue);
        jtxt.setBackground(Color.yellow);

        JTextField jtxt2 = new JTextField();
        jtxt2.setBounds(400,200,300,50);
        jtxt2.setText("text box2...");

        Font f1 = new Font("arial" ,Font.BOLD,30);
        jtxt2.setFont(f1);

        jtxt2.setForeground(Color.blue);
        jtxt2.setBackground(Color.yellow);

        contr.setLayout(null);

        // password

        JPasswordField pwd = new JPasswordField();
        pwd.setBounds(100,300,300,50);
        pwd.setText("123456");
        pwd.setFont(f);
        pwd.setForeground(Color.blue);
        pwd.setBackground(Color.yellow);
        pwd.setEchoChar('$');
        pwd.setEchoChar((char)0);

        JPasswordField pwd1 = new JPasswordField();
        pwd1.setBounds(400,300,300,50);
        pwd1.setText("123456");
        pwd1.setFont(f);
        pwd1.setForeground(Color.blue);
        pwd1.setBackground(Color.yellow);
        pwd1.setEchoChar('$');
        pwd1.setEchoChar((char)0);



        contr.add(jtxt);
        contr.add(jtxt2);
        contr.add(pwd);
        contr.add(pwd1);

        jf.setVisible(true);

     }
}
