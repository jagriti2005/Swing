import java.awt.*;
import javax.swing.*;
public class Language {
    public static void main(String[] args) {
        
        JFrame f = new JFrame();
        JLabel l1 = new JLabel("Select known Languages");
        l1.setBounds(100,50,150,80);
        f.add(l1);

        JCheckBox c2 = new JCheckBox("Hindi");
        c2.setBounds(100,150,130,50);
        f.add(c2);

        JCheckBox c3 = new JCheckBox("English");
        c3.setBounds(100,200,80,50);
        f.add(c3);

        JCheckBox c4 = new JCheckBox("marathi");
        c4.setBounds(100,250,80,50);
        f.add(c4);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
