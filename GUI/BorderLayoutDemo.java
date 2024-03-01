package GUI;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("BorderLayout Demo");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(100,100,600,500);
        jf.setLocationRelativeTo(null);

        Container c= new Container();
        c= jf.getContentPane();


JButton b1 = new JButton("North");
JButton b2 = new JButton("South");
JButton b3 = new JButton("East");
JButton b4 = new JButton("West");
JButton b5 = new JButton("Center");

BorderLayout b = new BorderLayout();
c.setLayout(b);

c.add(b1, BorderLayout.NORTH);
c.add(b2, BorderLayout.SOUTH);
c.add(b3,BorderLayout.EAST);
c.add(b4, BorderLayout.WEST);
c.add(b5, BorderLayout.CENTER);




jf.setVisible(true);
    }
    
}
