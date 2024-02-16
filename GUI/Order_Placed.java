package GUI;
import java.awt.Container;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Order_Placed {
    public static void main(String[] args){
        JFrame jf= new JFrame("This is an Advanced Java Class");
        jf.setSize(800,600);
        jf.setLocation(200,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= jf.getContentPane();
        c.setLayout(null);

        JCheckBox chbox1 = new JCheckBox("  Pizza - 100");
        JCheckBox chbox2 = new JCheckBox("  Pani Puri - 50");
        JCheckBox chbox3 = new JCheckBox("  Noodles - 120");
        JCheckBox chbox4 = new JCheckBox("  Samosa - 15");
        JCheckBox chbox5 = new JCheckBox("  Tea - 10");

        chbox1.setBounds(100,100,200,50);
        chbox2.setBounds(100,150,200,50);
        chbox3.setBounds(100,200,200,50);
        chbox4.setBounds(100,250,200,50);
        chbox5.setBounds(100,300,200,50);

        c.add(chbox1);
        c.add(chbox2);
        c.add(chbox3);
        c.add(chbox4);
        c.add(chbox5);

        JButton oderButton = new JButton("Placed Oder");
        oderButton.setBounds(100, 400, 200, 50);
        c.add(oderButton);

        oderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double total = 0;

                if(chbox1.isSelected()) {
                    total += 100;
                }
                if(chbox2.isSelected()) {
                    total += 50;
                }
                if(chbox3.isSelected()) {
                    total += 120;
                }
                if(chbox4.isSelected()) {
                    total += 15;
                }
                if(chbox5.isSelected()) {
                    total += 10;
                }

                JOptionPane.showMessageDialog(jf, "Total Bill: " + total);
            }
        });

        jf.setVisible(true);
    }
}