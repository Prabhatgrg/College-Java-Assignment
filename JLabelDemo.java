import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemo {
    public static void main(String[] args){
        JFrame jf;
        jf = new JFrame("LinkedIn");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(200,200,600,500);

        Container container = jf.getContentPane();
        container.setLayout(null);

        JLabel normalLabel = new JLabel("Normal Label");
        normalLabel.setBounds(20,20,100,30);
        container.add(normalLabel);

        Font font = new Font("Arial",Font.BOLD,25);
        JLabel fontLabel = new JLabel("Font Label");
        fontLabel.setFont(font);
        fontLabel.setBounds(20,60,200,30);
        container.add(fontLabel);
        
        ImageIcon imageIcon = new ImageIcon("linkedin.png");
        JLabel imageLabel = new JLabel("Image Label", imageIcon,JLabel.LEFT);
        imageLabel.setBounds(20,100,250,100);
        container.add(imageLabel);

        jf.setVisible(true);
    }
}
