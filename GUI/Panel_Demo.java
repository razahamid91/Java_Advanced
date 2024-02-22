package GUI;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel_Demo {

    // component
    // Havey weight component -> can not added to other components
    // 2.- light weight component -> can be added to other components

    // container-> it my contain some other light weight component
    // JPanel->
    // 1.- it is light weight component
    // 2/- it is also a comtainer 
    // 3.- it can add with other components like JButton and JLabel .

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(100,100,800,600);

        Container c=jf.getContentPane();
        c.setLayout(null);

        JPanel jp=new JPanel();
        jp.setBounds(00,00,200,200);
        c.add(jp);
        // jf.add(jp);

        jp.setLayout(null);
        jp.setBackground(Color.BLUE);

        JPanel jp2=new JPanel();
        jp2.setBounds(50,50,200,200);
        jp.add(jp2);
        jp2.setLayout(null);
        jp2.setBackground(Color.RED);

        JButton btn = new JButton("my button");
        btn.setBounds(100,100,100,50);
        jp2.add(btn);

    


        jf.setVisible(true);
        
    }
    
}
