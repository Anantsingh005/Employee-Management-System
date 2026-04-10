package employee.management.system;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;



public class AddEmployee extends JFrame implements ActionListener {

    AddEmployee() {
        getContentPane().setBackground(new Color(163,255,188));
        JLabel title = new JLabel("Add Employee Details");
        title.setBounds(350, 20, 400, 50);
        title.setFont(new Font("Serif", Font.BOLD, 25));
        add(title);





        setSize(900, 700);
        setLayout(null);
        setLocation(300, 50);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }


    public static void main(String[] args) {
        new AddEmployee();
    }
    
}
