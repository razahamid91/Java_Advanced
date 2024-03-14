package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

class MyFrame9 extends JFrame{

    MyFrame9(){

        setBounds(100,100,800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        setTitle("Canvas");
        c=getContentPane();
        c.setLayout(null);


        setVisible(true);

    }

    public void paint(Graphics g){
        Font f = new Font("Arial", 10,30);

        g.setFont(f);


        g.drawString("KE001",20,30);
        setBackground(Color.GREEN);
        g.fillOval(100, 200, 30, 50);
        g.fillRect(100, 100, 50, 60);
        
    }
}

public class CanvasDemo {
    public static void main(String[] args) {
        new MyFrame9();
    }
    
}
