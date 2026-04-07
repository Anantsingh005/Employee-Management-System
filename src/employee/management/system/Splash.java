package employee.management.system;

import javax.swing.*;

public class Splash extends JFrame {

    Splash(){



        setSize(1170,650);
        setLayout(null);
        setLocation(200,100);
        setVisible(true);

        try {
            Thread.sleep(7000);
            setVisible(false);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new Splash();
    }
}
