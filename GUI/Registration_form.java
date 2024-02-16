package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration_form {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 2));

        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(15);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(15);

        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        JLabel subjectLabel = new JLabel("Subjects:");
        JCheckBox mathCheckBox = new JCheckBox("Math");
        JCheckBox scienceCheckBox = new JCheckBox("Science");
        JCheckBox englishCheckBox = new JCheckBox("English");

        JLabel casteLabel = new JLabel("Caste:");
        String[] casteOptions = {"General", "OBC", "SC", "ST"};
        JComboBox<String> casteComboBox = new JComboBox<>(casteOptions);

        JButton submitButton = new JButton("Submit");

        formPanel.add(nameLabel, gbc);
        gbc.gridy++;
        formPanel.add(nameField, gbc);
        gbc.gridy++;
        formPanel.add(emailLabel, gbc);
        gbc.gridy++;
        formPanel.add(emailField, gbc);
        gbc.gridy++;
        formPanel.add(genderLabel, gbc);
        gbc.gridy++;
        formPanel.add(maleRadio, gbc);
        gbc.gridy++;
        formPanel.add(femaleRadio, gbc);
        gbc.gridy++;
        formPanel.add(subjectLabel, gbc);
        gbc.gridy++;
        formPanel.add(mathCheckBox, gbc);
        gbc.gridy++;
        formPanel.add(scienceCheckBox, gbc);
        gbc.gridy++;
        formPanel.add(englishCheckBox, gbc);
        gbc.gridy++;
        formPanel.add(casteLabel, gbc);
        gbc.gridy++;
        formPanel.add(casteComboBox, gbc);
        gbc.gridy++;
        formPanel.add(submitButton, gbc);

        JTextArea displayArea = new JTextArea(10, 20);
        displayArea.setEditable(false);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String gender = maleRadio.isSelected() ? "Male" : "Female";
                String subjects = "";
                if (mathCheckBox.isSelected()) subjects += "Math, ";
                if (scienceCheckBox.isSelected()) subjects += "Science, ";
                if (englishCheckBox.isSelected()) subjects += "English";
                String caste = casteComboBox.getSelectedItem().toString();

                String message = "Registration Details:\n\n" +
                        "Name: " + name + "\n" +
                        "Email: " + email + "\n" +
                        "Gender: " + gender + "\n" +
                        "Subjects: " + subjects + "\n" +
                        "Caste: " + caste;

                displayArea.setText(message);
            }
        });

        frame.add(formPanel);
        frame.add(new JScrollPane(displayArea));

        frame.setVisible(true);
    }
}



// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class RegistrationForm {
//     public static void main(String[] args) {
//         JFrame frame = new JFrame("Registration Form");
//         frame.setSize(400, 300);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setLayout(new GridBagLayout());
//         GridBagConstraints gbc = new GridBagConstraints();
//         gbc.gridx = 0;
//         gbc.gridy = 0;
//         gbc.anchor = GridBagConstraints.WEST;
//         gbc.insets = new Insets(5, 5, 5, 5);

//         JLabel nameLabel = new JLabel("Name:");
//         JTextField nameField = new JTextField(15);

//         JLabel emailLabel = new JLabel("Email:");
//         JTextField emailField = new JTextField(15);

//         JLabel genderLabel = new JLabel("Gender:");
//         JRadioButton maleRadio = new JRadioButton("Male");
//         JRadioButton femaleRadio = new JRadioButton("Female");
//         ButtonGroup genderGroup = new ButtonGroup();
//         genderGroup.add(maleRadio);
//         genderGroup.add(femaleRadio);

//         JLabel subjectLabel = new JLabel("Subjects:");
//         JCheckBox mathCheckBox = new JCheckBox("Math");
//         JCheckBox scienceCheckBox = new JCheckBox("Science");
//         JCheckBox englishCheckBox = new JCheckBox("English");

//         JLabel casteLabel = new JLabel("Caste:");
//         String[] casteOptions = {"General", "OBC", "SC", "ST"};
//         JComboBox<String> casteComboBox = new JComboBox<>(casteOptions);

//         JButton submitButton = new JButton("Submit");

//         frame.add(nameLabel, gbc);
//         gbc.gridy++;
//         frame.add(nameField, gbc);
//         gbc.gridy++;
//         frame.add(emailLabel, gbc);
//         gbc.gridy++;
//         frame.add(emailField, gbc);
//         gbc.gridy++;
//         frame.add(genderLabel, gbc);
//         gbc.gridy++;
//         frame.add(maleRadio, gbc);
//         gbc.gridy++;
//         frame.add(femaleRadio, gbc);
//         gbc.gridy++;
//         frame.add(subjectLabel, gbc);
//         gbc.gridy++;
//         frame.add(mathCheckBox, gbc);
//         gbc.gridy++;
//         frame.add(scienceCheckBox, gbc);
//         gbc.gridy++;
//         frame.add(englishCheckBox, gbc);
//         gbc.gridy++;
//         frame.add(casteLabel, gbc);
//         gbc.gridy++;
//         frame.add(casteComboBox, gbc);
//         gbc.gridy++;
//         frame.add(submitButton, gbc);

//         submitButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 String name = nameField.getText();
//                 String email = emailField.getText();
//                 String gender = maleRadio.isSelected() ? "Male" : "Female";
//                 String subjects = "";
//                 if (mathCheckBox.isSelected()) subjects += "Math, ";
//                 if (scienceCheckBox.isSelected()) subjects += "Science, ";
//                 if (englishCheckBox.isSelected()) subjects += "English";
//                 String caste = casteComboBox.getSelectedItem().toString();

//                 String message = "Registration Details:\n\n" +
//                         "Name: " + name + "\n" +
//                         "Email: " + email + "\n" +
//                         "Gender: " + gender + "\n" +
//                         "Subjects: " + subjects + "\n" +
//                         "Caste: " + caste;

//                 JOptionPane.showMessageDialog(frame, message);
//             }
//         });

//         frame.setVisible(true);
//     }
// }