import java.awt.*;

import javax.swing.*;

public class LoginForm extends JFrame {
    final private Font mainFont = new Font("Segeo print", Font.BOLD, 18);
    JTextField tfEmail;
    JPasswordField pfPassword;
    JFrame formPanel;

    public void initialize() {
        /************ From pael ************/
JLabel lbLoginForm = new JLabel("Login Form", SwingConstants.CENTER);
lbLoginForm.setFont(mainFont);

JLabel lbEmail = new JLabel("Email");
lbEmail.setFont(mainFont);


tfEmail = new JTextField();
tfEmail.setFont(mainFont);

JLabel lbPassword = new JLabel("password");
lbPassword.setFont(mainFont);

pfPassword = new JPasswordField();
pfPassword.setFont(mainFont);

JPanel formJPanel = new JPanel();
formPanel.setLayout(new GridLayout(0, 1, 10, 10));
formJPanel.add(lbLoginForm);
formPanel.add(lbEmail);
formPanel.add(tfEmail);
formPanel.add(lbPassword);
formPanel.add(pfPassword);


/*Buttons Panel */




/*Initialise the frame */

add(formPanel, BorderLayout.NORTH);

        setTitle("Logi Form");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(400, 500);
        setMinimumSize(new Dimension(350, 450));
        // setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}

6.55
