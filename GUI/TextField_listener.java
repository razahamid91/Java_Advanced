package GUI;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

class MyFrame1 extends JFrame implements ActionListener {
JTextField ta;
Container c;
    MyFrame1(){

        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        c=getContentPane();
        c.setLayout(null);


        ta=new JTextField();
        ta.setFont(new Font("verdana", Font.BOLD,30));
        ta.setBounds(100,100,300,50);
        c.add(ta);

        ta.addActionListener(this);



        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        ta.setText(ta.getText().toUpperCase());
    }
    
}

public class TextField_listener {

    public static void main(String[] args) {
        new MyFrame1();
        
    }
    
}
