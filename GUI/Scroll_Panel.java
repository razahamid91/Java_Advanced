package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Scroll_Panel {
    public static void main(String[] args) {

         JFrame jf= new JFrame("scroll_panel");
        jf.setSize(800,600);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= jf.getContentPane();
        c.setLayout(new FlowLayout());

        String [] item ={"tea", "coffee", "pizza", "noodles", "coca", "cheese", "momo", "samosa"};

        JList <String> list = new JList<>(item);
        list.setFont(new Font("verdana", Font.BOLD,30));
        JScrollPane jsp = new JScrollPane(list);
        jsp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jf.add(jsp);
        jsp.setBounds(200,100,300,150);

        // JTextArea jta= new JTextArea(5,5);
        // jta.setFont(new Font("verdana", Font.BOLD,30));
        // JScrollPane jsp= new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        // jta.setLineWrap(true);
        // jf.add(jsp);



        jf.setVisible(true);
        
    }
    
}
