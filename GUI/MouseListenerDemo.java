package GUI;

import java.awt.Color;

/*
 1-mouseExited
 2-mouseEntered
 mouseReleased
 mousePressed
 mouseClicked
 */

import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

class MyFrame5 extends JFrame  implements MouseListener {
    JTextArea ta;
    JLabel l;
    MyFrame5(){
        setTitle("key event handler");
        setBounds(100,100,800,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        ta = new JTextArea();
ta.setBounds(50,200,400,400);
Font f = new Font("Verdana", Font.BOLD,30);
       
        ta.setFont(f);
        ta.addMouseListener(this);
        c.add(ta);

 l = new JLabel("Mouse Area");
l.setBounds(20,20,200,200);
l.setFont(f);
c.add(l);
l.addMouseListener(this);



        setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
       ta.setText(ta.getText()+ "mouse is clicked");
       
    }
    @Override
    public void mousePressed(MouseEvent e) {
        ta.setText(ta.getText()+ "mouse is pressed");
       
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        ta.setText(ta.getText() + "mouse is released");
    
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        l.setForeground(Color.BLUE);
        ta.setBackground(Color.RED);

        
    }
    @Override
    public void mouseExited(MouseEvent e) {
        l.setForeground(Color.RED);
        ta.setText(ta.getText()+ "mosue is exite");
        ta.setBackground(Color.YELLOW);
       
    }
}

public class MouseListenerDemo {
    public static void main(String[] args) {
        new MyFrame5();
        
    }
    
}
