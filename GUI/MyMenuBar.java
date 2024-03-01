package GUI;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

/*
 parts of menu bar 
 1- menu bar 
 2-menus
 3- menu items
 */

public class MyMenuBar  {
    public static void main(String[] args) {

         JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(800, 600);
        jf.setLocationRelativeTo(null);

        Container c= jf.getContentPane();
        c.setLayout(null);

        //menubar 

        JMenuBar menubar= new JMenuBar();

        //menus

        JMenu file= new JMenu("File");

        //menu items

        JMenuItem f1 = new JMenuItem("new");
        JMenuItem f2 = new JMenuItem("open");
        JMenuItem f3 = new JMenuItem("save");

        // adding  menu items wth menu 

        file.add(f1);
        file.add(f2);
        file.add(f3);

        // menus added with menubar

        menubar.add(file);
        // jf.setJMenuBar(menubar);

        
        JMenu edit = new JMenu("Edit");
        //menu item

        JMenuItem e1 = new JMenuItem("copy");
        JMenuItem e2 = new JMenuItem("cut");
        JMenuItem e3 = new JMenuItem("paste");
        JMenuItem e4 = new JMenuItem("delete");
        JMenuItem e5 = new JMenuItem("selectAll");
        

        //ADDING 

        edit.add(e1);
        edit.add(e2);
        edit.add(e3);
        edit.add(e4);
        edit.add(e5);

        // add with menubar 

        menubar.add(edit);

        jf.setJMenuBar(menubar);



        JTextArea ta= new JTextArea(10,50);
        ta.setBounds(10,10,700,500);
        ta.setFont(new Font("verdana", Font.PLAIN,30));

        c.add(ta);




        jf.setVisible(true);


        
    }
    
}
