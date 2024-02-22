package GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*TYPES OF LAyout 
1- null -> when the component positions def by us.
2- border LAyout -> top, bottom, left, right.
3- flow LAyout-> arrenge the component automatically
4- grid LAyout-> in the form of matrix
5- gridbag LAyout-> like gird + resizable it self
6- group LAyout-> arrenge group wise 
7- box layout -> 
8- caed layout-> one at a time */

public class FlowLayout_Demo {
    public static void main(String[] args) {

        JFrame jf = new JFrame("FlowLayout");
        jf.setBounds(100,100,600,800);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c =jf.getContentPane();
        // c.add(jf);
        c.setLayout(null);



        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");
        JButton btn6 = new JButton("Button 6");

        
        

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        c.add(btn6);

        FlowLayout fl=new FlowLayout(FlowLayout.CENTER, 20,50);
        c.setLayout(fl);

        




        jf.setVisible(true);

        
       
        
    }
    
}
