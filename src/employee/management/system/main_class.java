package employee.management.system;

import javax.swing.JFrame;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import static java.awt.Color.BLACK;
import static java.awt.Color.WHITE;


public class main_class extends JFrame implements ActionListener {

    main_class() {
        ImageIcon bgIcon = new ImageIcon(getClass().getResource("/Icons/home.jpg"));
        Image bgImg = bgIcon.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        JLabel bg = new JLabel(new ImageIcon(bgImg));
        bg.setBounds(0, 0, 1120, 630);
        add(bg);

        JLabel h1 = new JLabel("Employee Management System");
        h1.setBounds(325, 155, 440, 40);
        h1.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 30));
        h1.setForeground(java.awt.Color.BLACK);
        bg.add(h1);


        JButton add = new JButton("Add Employee");
        add.setBounds(335, 270, 150, 40);
        add.setForeground(WHITE);
        add.setBackground(BLACK);
        add.addActionListener(this);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
            }
        });
        bg.add(add);


        JButton view = new JButton("View Employee");
        view.setBounds(535, 270, 150, 40);
        view.setForeground(WHITE);
        view.setBackground(BLACK);
        view.addActionListener(this);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        bg.add(view);


        JButton update = new JButton("Update Employee");
        update.setBounds(335, 350, 150, 40);
        update.setForeground(WHITE);
        update.setBackground(BLACK);
        update.addActionListener(this);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        bg.add(update);


        JButton remove = new JButton("Remove Employee");
        remove.setBounds(535, 350, 150, 40);
        remove.setForeground(WHITE);
        remove.setBackground(BLACK);
        remove.addActionListener(this);
        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        bg.add(remove);
        

        setSize(1120, 630);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    public static void main(String[] args) {
        new main_class();
    }
    
}
