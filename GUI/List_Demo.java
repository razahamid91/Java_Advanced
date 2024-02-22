package GUI;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


class Mylist extends JFrame {

    String values[]={
        "one", "two", "three", "four", "five", 
        "six", "seven", "eight", "nine","ten",
    };
    Mylist(){
        setSize(700,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        JList list = new JList(values);
        list.setFont(new Font("Arial", Font.BOLD,30));
        JPanel jp = new JPanel();
        jp.add(new JScrollPane(list));
        add(jp);
        revalidate();
    }
}

public class List_Demo {
    public static void main(String[] args) {
        new Mylist();
        

    }
    
}
