import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentFormFlat extends JFrame {

    JTextField nameField, emailField, phoneField, dobField, addressField;
    JComboBox<String> courseBox;
    JRadioButton maleBtn, femaleBtn, otherBtn;
    ButtonGroup genderGroup;

    public StudentFormFlat() {
        setTitle("Student Registration - Modern Flat");
        setSize(550, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(new Color(240, 245, 250));

        JLabel title = new JLabel("Student Registration", SwingConstants.CENTER);
        title.setFont(new Font("Poppins", Font.BOLD, 24));
        title.setBorder(BorderFactory.createEmptyBorder(15, 0, 10, 0));
        add(title, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridLayout(7, 2, 10, 10));
        formPanel.setBackground(new Color(240, 245, 250));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));

        // Fields
        nameField = new JTextField();
        emailField = new JTextField();
        phoneField = new JTextField();
        dobField = new JTextField();
        addressField = new JTextField();
        courseBox = new JComboBox<>(new String[]{"Select Course", "Java", "Python", "Web Dev", "AI/ML"});

        maleBtn = new JRadioButton("Male");
        femaleBtn = new JRadioButton("Female");
        otherBtn = new JRadioButton("Other");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleBtn);
        genderGroup.add(femaleBtn);
        genderGroup.add(otherBtn);

        JPanel genderPanel = new JPanel();
        genderPanel.setBackground(new Color(240, 245, 250));
        genderPanel.add(maleBtn);
        genderPanel.add(femaleBtn);
        genderPanel.add(otherBtn);

        formPanel.add(new JLabel("Name:"));
        formPanel.add(nameField);
        formPanel.add(new JLabel("Email:"));
        formPanel.add(emailField);
        formPanel.add(new JLabel("Phone:"));
        formPanel.add(phoneField);
        formPanel.add(new JLabel("Gender:"));
        formPanel.add(genderPanel);
        formPanel.add(new JLabel("DOB (yyyy-MM-dd):"));
        formPanel.add(dobField);
        formPanel.add(new JLabel("Course:"));
        formPanel.add(courseBox);
        formPanel.add(new JLabel("Address:"));
        formPanel.add(addressField);

        add(formPanel, BorderLayout.CENTER);

        JPanel btnPanel = new JPanel(new FlowLayout());
        String[] btnNames = {"Back", "Save", "Clear", "View All", "Exit"};
        Color[] colors = {
                new Color(180, 180, 180),
                new Color(100, 200, 100),
                new Color(255, 200, 0),
                new Color(100, 160, 255),
                new Color(255, 100, 100)
        };
        for (int i = 0; i < btnNames.length; i++) {
            JButton btn = new JButton(btnNames[i]);
            btn.setBackground(colors[i]);
            btn.setFocusPainted(false);
            btn.setFont(new Font("Poppins", Font.BOLD, 14));
            btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnPanel.add(btn);
        }
        add(btnPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentFormFlat();
    }
}
