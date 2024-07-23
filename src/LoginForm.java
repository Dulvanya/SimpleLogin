import java.awt.*;

import javax.swing.*;

public class LoginForm extends JFrame{
    public void initialize(){
        /*Form Panel */

JLabel lbLoginForm = new JLabel("Login Form", SwingConstants,CENTER);







        
        setTitle("Login Form");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(400, 500);
        setMinimumSize(new Dimension(350, 450));
        //setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}