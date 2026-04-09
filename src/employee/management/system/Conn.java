package employee.management.system;

import java.beans.Statement;
import java.sql.Connection;

public class Conn {
    Connection con;
    Statement smt;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeManagement", "root", "Anant@005");
            smt = (Statement) con.createStatement();        
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
