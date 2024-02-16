package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MytextArea {

    public static void main(String[] args){
        JFrame jf= new JFrame("this a adv java class");
        jf.setSize(800,600);
        jf.setLocation(200,200);
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= jf.getContentPane();
        c.setLayout(null);

        JTextArea textArea = new JTextArea();
        textArea.setSize(200,200);
        textArea.setLocation(100,100);
        c.add(textArea);
        jf.setBackground(Color.LIGHT_GRAY);
        textArea.setBackground(Color.yellow);
        
        textArea.setFont(new Font("verdana", Font.BOLD, 30));

        textArea.setLineWrap(true);
        textArea.setEnabled(false);
        textArea.setText("this is text area");



        jf.setVisible(true);
    }
    
}
