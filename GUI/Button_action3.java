package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class RedClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Button_action3.c.setBackground(Color.RED);
    }
}

class YellowClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Button_action3.c.setBackground(Color.YELLOW);
    }
}

class GreenClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Button_action3.c.setBackground(Color.GREEN);
    }
}

public class Button_action3 {
    public static Container c;

    public static void main(String[] args) {
        JFrame jf = new JFrame("Button Action 3");
        jf.setBounds(100, 200, 700, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = jf.getContentPane();
        c.setLayout(null);
        JButton btnRed = new JButton("Red");
        JButton btnYellow = new JButton("Yellow");
        JButton btnGreen = new JButton("Green");
        btnRed.setBounds(100, 50, 100, 50);
        btnYellow.setBounds(200, 50, 100, 50);
        btnGreen.setBounds(300, 50, 100, 50);
        c.add(btnRed);
        c.add(btnYellow);
        c.add(btnGreen);
        btnRed.addActionListener(new RedClass());
        btnYellow.addActionListener(new YellowClass());
        btnGreen.addActionListener(new GreenClass());
        jf.setVisible(true);
    }
}