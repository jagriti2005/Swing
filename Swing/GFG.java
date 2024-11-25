import java.io.*;
import javax.swing.*;
public class GFG {
    public static void main(String[] args) {
        
        //creating instance of JFrame
        JFrame frame = new JFrame();

        //creating instance of JButton
        JButton button = new JButton("GFG WebSite Click");

        // x-axis,y-axis,width,height
        button.setBounds(150,200,220,50);

        //adding button in JFrame
        frame.add(button);

        //set size of the frame
        frame.setSize(500,600);

        // using no layout managers
        frame.setLayout(null);

        // making frame visisble
        frame.setVisible(true);
    }
}
