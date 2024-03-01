package GUI;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class MyFrame3 extends JFrame implements ItemListener{
    JComboBox cb;
    JTextArea ta;

    MyFrame3(){
        Container c = getContentPane();
        c.setLayout(null);


Font f = new Font("Helvetica", Font.BOLD,30);
String s [] ={"Apple", "Banana", "Orange", "ange", "Mango","tamato"};
cb = new JComboBox(s);
cb.setFont(f);
cb.setBounds(10,100,200,50);
c.add(cb);
cb.addItemListener(this);


ta = new JTextArea(3,10);
ta.setFont(f);
ta.setBounds(250,100,200,300);
c.add(ta);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // String s= ta.getText();
       ta.setText(cb.getSelectedItem().toString());
    }

}

public class ComboBoxEvent {
    public static void main(String[] args) {

        MyFrame3 f= new MyFrame3();
        f.setTitle("item event");
       f.setBounds(100,100,600,500);
       f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);









        f.setVisible(true);

        
        
    }
    
}
