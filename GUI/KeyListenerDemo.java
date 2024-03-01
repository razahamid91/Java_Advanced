package GUI;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

/*
 methods
1- KeyListener
2- keyPressed
3- keyReleased
4- keyTyped
5- addEventListener () -> add

 */

 class MyFrame4 extends JFrame  implements KeyListener{
    JTextArea ta;
    MyFrame4(){
        setTitle("key event handler");
        setBounds(100,100,800,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);


ta = new JTextArea();
ta.setBounds(10,10,600,500);
Font f = new Font("Verdana", Font.BOLD,30);
        c.add(ta);
        ta.setFont(f);

        ta.addKeyListener(this);



        setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        ta.setText(ta.getText()+ "\n key typed :" + e.getKeyChar());

       
    }
    @Override
    public void keyPressed(KeyEvent e) {
        ta.setText(ta.getText()+"\n keyPressed :" + e.getKeyChar());
        
    }
    @Override
    public void keyReleased(KeyEvent e) {
        ta.setText(ta.getText()+"\n keyReleased :" + e.getKeyChar());
        
    }
 }

public class KeyListenerDemo {
    public static void main(String[] args) {
        new MyFrame4();
        
    }
    
}
