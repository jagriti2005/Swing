// it is assumed that 1 doller is equal to 65.25

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CurrencyConverter {
    public static void converter(){

        // Function to convert from rupee
        // to the dollar and vice-versa
        // using Java Swing
        JFrame f = new JFrame("CONVERTER");

        JLabel l1 = new JLabel("Rupees: ");
        l1.setBounds(20,40,60,30);
        f.add(l1);

        JLabel l2 = new JLabel("Dollars: ");
        l2.setBounds(170,40,60,30);
        f.add(l2);

        JTextField t1 = new JTextField("0");
        t1.setBounds(80,40,50,30);
        f.add(t1);

        JTextField t2 = new JTextField("0");
        t2.setBounds(240,40,50,30);
        f.add(t2);

        JButton b1 = new JButton("INR");
        b1.setBounds(50,80,60,15);
        f.add(b1);

        JButton b2 = new JButton("Dollar");
        b2.setBounds(190,80,100,15);
        f.add(b2);

        JButton b3 = new JButton("Close");
        b3.setBounds(150,150,100,30);
        f.add(b3);


        // adding action listener
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                
                //Converting to double
                double d = Double.parseDouble(t1.getText());

                //Converting rupees to dollars
                double d1 = (d/65.25);

                //Getting the string value of the
                //calculated value
                String str1 = String.valueOf(d1);
                
                //Placing it in text box
                t2.setText(str1);
                
            }
        });



        // adding action listener
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                
                //Converting to double
                double d2 = Double.parseDouble(t2.getText());

                //Converting rupees to dollars
                double d3 = (d2 * 65.25);

                //Getting the string value of the
                //calculated value
                String str2 = String.valueOf(d3);
                
                //Placing it in text box
                t1.setText(str2);
            }
        });


        // action listener to close the form 
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                f.dispose();
            }
        });

        // default method for closing the frame
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });


        f.setLayout(null);
        f.setSize(400,300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        converter();
    }
}
