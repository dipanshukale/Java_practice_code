package Connectivity_sql;
import java.awt.event.ActionEvent;
import java.sql.*;
import database.Data;




public class Connect {
    public static void main(String[] args) {
        try {

            //loaded driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            //connection established
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student?useTimezone=true&serverTimezone=UTC","root","Manjusha@3082");

            //execute sql query
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from entry");

            if (rs.next()){
                String val = rs.getString(1);
                String val1 = (rs.getString(2));
                String val2 = (rs.getString(3));
                String val3 = (rs.getString(4));
                System.out.println();



            }
            con.close();

        }
        catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }




    }
}
