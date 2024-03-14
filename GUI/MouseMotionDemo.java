package GUI;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;



    class MyFrame7 extends JFrame implements MouseMotionListener{
        JLabel lbl;
        JTextArea ta;
        

        MyFrame7(){
            setBounds(100,100,800,600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            Container c = getContentPane();
            setTitle("Mouse Motion Demo");
            c=getContentPane();
            c.setLayout(null);

                Font f =new Font("om" , Font.BOLD,30);
                lbl=new JLabel("welcome");
                lbl.setBounds(100,100 , 500, 50);
                lbl.setFont(f);
                c.add(lbl);

                setVisible(true);
        }


        @Override
        public void mouseDragged(MouseEvent e) {
            ta.setText(ta.getText() +"\nmouse is dragging");
           
        }


        @Override
        public void mouseMoved(MouseEvent e) {
            ta.setText(ta.getText() + "mouse is moving");
           
        }
    }
    public class MouseMotionDemo {
    public static void main(String[] args) {
           new MyFrame7();
        
    }
    
}
