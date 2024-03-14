package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;



    class MyFrame8 extends JFrame implements MouseMotionListener{
        JLabel lbl;
        JTextArea ta;
        

        MyFrame8(){
            setBounds(100,100,800,600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            Container c = getContentPane();
            setLocationRelativeTo(null);
            setTitle("Mouse Motion Demo");
            c=getContentPane();
            c.setLayout(null);

                Font f =new Font("om" , Font.BOLD,30);
                lbl=new JLabel("welcome");
                lbl.setBounds(100,100 , 500, 50);
                lbl.setFont(f);
                addMouseMotionListener(this);
                c.add(lbl);

                setVisible(true);
        }


        @Override
        public void mouseDragged(MouseEvent e) {
            Graphics g= getGraphics();
            g.setColor(Color.red);
            g.fillOval(e.getX(), e.getY(), 20, 20);
           
        }


        @Override
        public void mouseMoved(MouseEvent e) {
            ta.setText(ta.getText() + "mouse is moving");
           
        }
    }
    public class MouseMotionDemo2 {
    public static void main(String[] args) {
           new MyFrame8();
        
    }
    
}
