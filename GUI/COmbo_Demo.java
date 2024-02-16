package GUI;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class COmbo_Demo {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(800, 600);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c = jf.getContentPane();
        c.setLayout(null);
        String[] menu = {"pepsi", "coca", "mirinda", "7-up", "sprite"};
        JComboBox jcb = new JComboBox(menu);
        jcb.setBounds(100, 100, 200, 50);
        jcb.setFont(new Font("verdana", Font.PLAIN, 30));
        c.add(jcb);
        jcb.addItem("milk");
        jcb.addItem("Cookie");
        jcb.setSelectedItem("milk");
        
        JButton btn = new JButton("Select item");
        btn.setBounds(300, 100, 300, 50);
        btn.setFont(new Font("verdana", Font.BOLD, 30));
        c.add(btn);
        
        JLabel lbl = new JLabel();
        lbl.setBounds(120, 400, 300, 50);
        lbl.setFont(new Font("verdana", Font.BOLD, 30));
        lbl.setForeground(Color.GREEN);
        c.add(lbl);
        
        JLabel lblamount = new JLabel("The Price is : ");
        lblamount.setBounds(300, 250, 200, 50);
        lblamount.setForeground(Color.RED);
        c.add(lblamount);
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int price = 0;
                String selected = jcb.getSelectedItem().toString();
                if (selected.equals("milk")) {
                    price = 100;
                }  if (selected.equals("Cookie")) {
                    price = 50;
                }
                if (selected.equals("sprite")) {
                    price = 150;
                } 
                if (selected.equals("7-up")) {
                    price = 200;
                } 
                if (selected.equals("mirinda")) {
                    price = 250;
                } 
                if (selected.equals("coca")) {
                    price = 300;
                } 
                if (selected.equals("pepsi")) {
                    price = 400;
                } 
                lblamount.setText("The Price is : " + price);
            }
        });
        
        jf.setVisible(true);
    }
}