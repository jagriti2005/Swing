// import java.io.*;
// import javax.swing.*;
// public class Button {
//     public static void main(String[] args) {
        
//         JFrame frame = new JFrame();

//         JButton b1 = new JButton("OK");
//         b1.setBounds(50,100,80,30);

//         JButton b2 = new JButton("SUBMIT");
//         b2.setBounds(150,100,100,30);

//         JButton b3 = new JButton("CANCEL");
//         b3.setBounds(270,100,100,30);

//         frame.add(b1);
//         frame.add(b2);
//         frame.add(b3);

//         frame.setSize(400,400);
//         frame.setLayout(null);
//         frame.setVisible(true);
//     }
// }


import javax.swing.*;
import java.awt.*;

public class Button {
    public static void main(String[] args) {
    
        JFrame frame = new JFrame("Button Example");

        
        JButton b1 = new JButton("OK");
        b1.setBounds(100, 50, 80, 50);  

        JButton b2 = new JButton("SUBMIT");
        b2.setBounds(100, 120, 100, 50);  

        JButton b3 = new JButton("CANCEL");
        b3.setBounds(100, 190, 120, 50);  

        
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);

       
        frame.setSize(400, 400);  
        frame.setLayout(null);    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true);   
    }
}