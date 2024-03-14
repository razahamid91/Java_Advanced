package GUI;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.CardLayout;

public class CardLayoutExample {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Card Layout Example");
        jf.setBounds(100, 100, 800, 600);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        Container c = jf.getContentPane();
        CardLayout cardLayout = new CardLayout();
        c.setLayout(cardLayout);
        
        JButton b1 = new JButton("Page 1");
        JButton b2 = new JButton("Page 2");
        JButton b3 = new JButton("Page 3");
        JButton b4 = new JButton("Page 4");
        JButton b5 = new JButton("Page 5");
        JButton b6 = new JButton("Page 6");
        
        Font f = new Font("Arial", Font.BOLD, 30);
        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);
        b4.setFont(f);
        b5.setFont(f);
        b6.setFont(f);
        
        c.add(b1, "1");
        c.add(b2, "2");
        c.add(b3, "3");
        c.add(b4, "4");
        c.add(b5, "5");
        c.add(b6, "6");
        
        cardLayout.show(c, "1"); 
        
        jf.setVisible(true);
    }
}