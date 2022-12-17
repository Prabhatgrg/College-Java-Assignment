import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameDemo{
    public static void main(String[] args){
        JFrame jf;
        jf = new JFrame("Visual Studio Code");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Seting close operation
        jf.setSize(400,400);
        jf.setLocation(300,150);

        //Creating a JFrame with name MyWindow
        JButton btn = new JButton("Say Hello");
        //Creating a Button named Say Hello
        jf.add(btn); // adding button to frame
        //Setting layout using Flowlayout object;
        jf.setVisible(true);
    }
}