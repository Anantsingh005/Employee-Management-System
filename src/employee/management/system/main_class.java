package employee.management.system;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class main_class extends JFrame implements ActionListener {

    main_class() {


        
        setSize(1170, 650);
        setLayout(null);
        setLocation(200, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    public static void main(String[] args) {
        new main_class();
    }
    
}
