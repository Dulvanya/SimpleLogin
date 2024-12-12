import java.awt.*;

import javax.swing.*;

public class LoginForm extends JFrame {
final private Font mainFont = new Font("Segeo print", Font.BOLD, 18);
JTextField tfEmail;

    public void initialize() {
        /************ From pael ************/
JLabel lbLoginForm = new JLabel("Login Form", SwingConstants.CENTER);
lbLoginForm.setFont(mainFont);

JLabel lbEmail = new JLabel("Email");
lbEmail.setFont(mainFont);




        setTitle("Logi Form");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(400, 500);
        setMinimumSize(new Dimension(350, 450));
        // setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}



4:58
