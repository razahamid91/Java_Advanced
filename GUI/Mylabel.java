package GUI;

import java.awt.Container;
import java.awt.Font;

import javax.swing.*;

public class Mylabel {
    public static void main(String[] args) {
        JFrame jf = new JFrame("demo");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

        jf.setBounds(500, 300, 800, 600);

        // for giving whole container properties
        Container contr = jf.getContentPane();

        contr.setLayout(null);

        JLabel label = new JLabel("user name");
        label.setBounds(100, 200, 200, 50);
        contr.add(label);

        Font f = new Font("calibri", Font.BOLD , 24);
        label.setFont(f);

       ImageIcon icon = new ImageIcon("/path/to/images.jpg");
        jf.setIconImage(icon.getImage());

    }
}
