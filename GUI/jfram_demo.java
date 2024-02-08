package GUI;

import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

public class jfram_demo {

    public static void main(String[] args) {

        JFrame jf = new JFrame("demo");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        // jf.setSize(800, 600);
        // jf.setLocation(500,300);
        jf.setBounds(500, 300, 800, 600); // for set size as well location is used setBounds

        // jf.setTitle("my first application of gui"); // for set title

        ImageIcon icon = new ImageIcon("\"D:\\sem8\\advanced java\\GUI\\images.jpg\""); // for set icon
        jf.setIconImage(icon.getImage());

        // for giving whole container properties
        Container contr = jf.getContentPane();
        contr.setBackground(Color.BLUE);

        // handle the resize button
        jf.setResizable(false);

    }

}
