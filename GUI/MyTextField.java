package GUI;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;

public class MyTextField {

    public static void main(String[] args) {
    

        //text field
        
        JFrame jf = new JFrame("demo");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(500, 300, 800, 600);

        // for giving whole container properties
        Container contr = jf.getContentPane();

        contr.setLayout(null);

        JTextField jtxt = new JTextField();
        jtxt.setBounds(200,200,300,50);
        jtxt.setText("Enter user name...");

        Font f = new Font("arial" ,Font.BOLD,30);
        jtxt.setFont(f);

        jtxt.setForeground(Color.blue);
        jtxt.setBackground(Color.yellow);

        // jtxt.setEditable(false);

        // password field and its properties

        JPasswordField pwd = new JPasswordField();
        pwd.setBounds(200,300,300,50);
        pwd.setText("123456");
        pwd.setFont(f);
        pwd.setForeground(Color.blue);
        pwd.setBackground(Color.yellow);
        pwd.setEchoChar('$');
        pwd.setEchoChar((char)0);



        contr.add(jtxt);
        contr.add(pwd);
        jf.setVisible(true);
        
    }
    
}
