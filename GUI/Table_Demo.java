package GUI;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table_Demo {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(800, 600);
        jf.setLocationRelativeTo(null);


        String data[][]={
            {"100","Hamid","22"},
            {"101","Sunny","21"},
            {"102","Amitabh","22"},
            {"103","Hira","23"},
            {"104","Puneet super star","35"}


        };
        String []col ={"Roll no.", "name", "Age"};
        JTable jt = new JTable(data, col);
        jf.add(new JScrollPane(jt));
        jt.setFont(new Font("verdana", Font.ITALIC,30));
        jt.setRowHeight(50);




        jf.setVisible(true);


        
    }
    
}
