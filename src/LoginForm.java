import java.awt.*;

import javax.swing.*;

public class LoginForm extends JFrame{
    final private Font mainFont = new Font ("Segoe print", Font.BOLD, 18);
    
    public void initialize(){
        /*Form Panel */


JLabel lbLoginForm = new JLabel("Login Form", SwingConstants.CENTER);
lbLoginForm.setFont(mainFont);
JTextField tfEmail;
JPasswordField pfPassword;

JLabel lbEmail = new JLabel("Email");
lbEmail.setFont(mainFont);

tfEmail = new JTextField();
tfEmail.setFont(mainFont);

JLabel lbPassword = new JLabel("Password");
lbPassword.setFont(mainFont);

pfPassword = new JPasswordField();
pfPassword.setFont(mainFont);

JPanel formPanel = new JPanel();
formPanel.setLayout(new GridLayout(0, 1, 10, 10));
formPanel.add(lbLoginForm);
formPanel.add(lbEmail);
formPanel.add(lbPassword);
formPanel.add(pfPassword);
        setTitle("Login Form");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(400, 500);
        setMinimumSize(new Dimension(350, 450));
        //setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}