package GUI;

import java.awt.Font;


import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table_demo2 {
    public static void main(String[] args) {
         JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(800, 600);
        jf.setLocationRelativeTo(null);

        Object [][] data = {
            {100,"Hamid","22-12-2010"},
            {101,"Sunny","21-jqn-2007"},
            {102,"Amitabh","22-december-2017"},
            {103,"Hira"},
            {106,""},
            {104,"Puneet super star","35"},
            {0,"","12-23-2008"}
        };

        String []col ={"S no.","name","DoB"};
        // DefaultTableModel dtm= new DefaultTableModel(data, col);

        JTable jt = new JTable();
        jf.add(new JScrollPane(jt));
        
        jf.setVisible(true);
    }
    
}
