package GUI;
import javax.swing.*;

public class jfram_demo {

    public static void main(String[] args){

        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        // jf.setSize(800, 600);
        // jf.setLocation(500,300);
        jf.setBounds(500,300,800,600); // for set size as well location is used setBounds   
    }
    
}