package Day8_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyExp {
    public static void main(String[] args) {
        try{
            // 1. Load the driver and then register
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. Establish the connection with the database
            /*
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaview_training",
                    "root","tiger");

             */


            String url="jdbc:mysql://localhost:3306/hexaview_training";
            String user= "root";
            String password="tiger";
            Connection con= DriverManager.getConnection(url, user, password);
            if(con!=null){
                System.out.println("Connected Successfully !!");
            }
            Statement st= con.createStatement();

            // Read
            ResultSet rs= st.executeQuery("select * from student");

            while(rs.next()){
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
            }

            // Create
            String insertQuery = "INSERT INTO student (roll_number, name) VALUES (104, 'Kapil')";
            int rowsInserted = st.executeUpdate(insertQuery);
            System.out.println(rowsInserted + " row(s) inserted.");

            // Update
            String updateQuery = "UPDATE student SET name = 'Kunal' WHERE roll_number = 104";
            int rowsUpdated = st.executeUpdate(updateQuery);
            System.out.println(rowsUpdated + " row(s) updated.");

            // Delete
            String deleteQuery = "DELETE FROM student WHERE roll_number = 104";
            int rowsDeleted = st.executeUpdate(deleteQuery);
            System.out.println(rowsDeleted + " row(s) deleted.");
            con.close();






        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
