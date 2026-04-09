package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// import java.sql.Statement;
// import java.sql.Connection;
// import java.sql.DriverManager;

public class Login extends JFrame implements ActionListener {

    JTextField t1;
    JPasswordField t2;
    JButton b1, b2;

    Login() {

        setLayout(null);
        ImageIcon bgIcon = new ImageIcon(getClass().getResource("/Icons/LoginB.jpg"));
        Image bgImg = bgIcon.getImage().getScaledInstance(900, 400, Image.SCALE_DEFAULT);
        JLabel bg = new JLabel(new ImageIcon(bgImg));
        bg.setBounds(0, 0, 900, 400);
        add(bg);

        ImageIcon boyIcon = new ImageIcon(getClass().getResource("/Icons/second.jpg"));
        Image boyImg = boyIcon.getImage().getScaledInstance(200, 350, Image.SCALE_SMOOTH);
        JLabel boy = new JLabel(new ImageIcon(boyImg));
        boy.setBounds(105, 80, 280, 300);
        bg.add(boy);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(350, 50, 350, 250);
        panel.setBackground(new Color(255, 255, 255, 180));
        bg.add(panel);

        JLabel title = new JLabel("Login");
        title.setBounds(130, 10, 100, 30);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(title);

        JLabel l1 = new JLabel("Username");
        l1.setBounds(30, 60, 100, 25);
        panel.add(l1);
        t1 = new JTextField();
        t1.setBounds(130, 60, 180, 30);
        panel.add(t1);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(30, 110, 100, 25);
        panel.add(l2);
        t2 = new JPasswordField();
        t2.setBounds(130, 110, 180, 30);
        panel.add(t2);

        b1 = new JButton("Login");
        b1.setBounds(40, 180, 120, 35);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(180, 180, 120, 35);
        b2.addActionListener(this);
        panel.add(b2);

        setSize(800, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // if (e.getSource() == b1) {
        // try {
        // String username = t1.getText();
        // String password = t2.getText();

        // Conn c = new Conn();
        // String query = "SELECT * FROM login WHERE username = '" + username + "' AND
        // password = '" + password + "'";
        // ResultSet rS = c.smt.executeQuery(query);
        // if (rS.next()) {
        // setVisible(false);
        // // new Home();
        // } else {
        // JOptionPane.showMessageDialog(null, "Invalid username or password");
        // t1.setText("");
        // t2.setText("");
        // }

        // } catch (Exception E) {
        // E.printStackTrace();
        // }

        if (e.getSource() == b1) {
            try {
                String username = t1.getText();
                String password = new String(t2.getPassword());

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter username and password");
                    return;
                }

                Conn c = new Conn();
                String query = "SELECT * FROM login WHERE username = ? AND password = ?";
                PreparedStatement ps = c.con.prepareStatement(query);

                ps.setString(1, username);
                ps.setString(2, password);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    setVisible(false);
                    new main_class();
                    JOptionPane.showMessageDialog(null, "Login Successful");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                    t1.setText("");
                    t2.setText("");
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

            
        } else if (e.getSource() == b2) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Login();
    }

}