import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldDemo {
    public static void main(String[] args){
        JFrame jf;
        jf = new JFrame("Text Field");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(200,200,600,500);

        Container container = jf.getContentPane();
        container.setLayout(null);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(50,50,100,30);
        container.add(nameLabel);

        JTextField jTextField = new JTextField("Enter");
        jTextField.setBounds(100,50,120,30);
        container.add(jTextField);

        jf.setVisible(true);
    }
}
