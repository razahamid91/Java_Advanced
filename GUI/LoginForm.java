package GUI;

import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {

    private JLabel usernameLabel;
    private JTextField usernameField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginForm() {
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // Create the username label and text field
        usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();

        // Create the password label and password field
        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        // Create the login button
        loginButton = new JButton("Login");

        // Add the components to the frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);

        // Center the frame on the screen
        setLocationRelativeTo(null);

        // Make the password field centered
        passwordField.setHorizontalAlignment(SwingConstants.CENTER);
    }

    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}