package GUI;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

class MyFrame6 extends JFrame{

    JButton b1 = new JButton("Button 1");
JButton b2 = new JButton("  Button 2");
JButton b3 = new JButton("Button 3");
JButton b4 = new JButton("Button 4");
JButton b5 = new JButton("Button 5");

MyFrame6(){
    setTitle("Grid layout");
        setBounds(100,100,800,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c = getContentPane();
        // c.setLayout(null);

GridLayout g = new GridLayout(3,2,10,5);
c.setLayout(g);
c.add(b1);
c.add(b2);
c.add(b3);
c.add(b4,0);
c.add(b5);


setVisible(true);
}
}

public class GridLayoutDemo {
    public static void main(String[] args) {
        new MyFrame6();
        
    }
    
}
