import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public static void main(String args[]) {

        JFrame jf = new JFrame("Login_Frame");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(500, 300, 500, 400);

        Container container = jf.getContentPane();
        container.setLayout(null);

        JLabel name = new JLabel("Name: ");
        name.setBounds(50, 50, 150, 30);
        container.add(name);

        JTextField textName = new JTextField("");
        textName.setBounds(120, 50, 170, 30);
        container.add(textName);

        JLabel address = new JLabel("Address: ");
        address.setBounds(50, 100, 150, 30);
        container.add(address);

        JTextField textAddress = new JTextField("");
        textAddress.setBounds(120, 100, 170, 30);
        container.add(textAddress);

        JLabel email = new JLabel("Email: ");
        email.setBounds(50, 150, 150, 30);
        container.add(email);

        JTextField textEmail = new JTextField("");
        textEmail.setBounds(120, 150, 170, 30);
        container.add(textEmail);

        JButton btn_login = new JButton("LogIn");
        btn_login.setBounds(150, 200, 100, 30);
        container.add(btn_login);

        btn_login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        jf.setVisible(true);

    }
}