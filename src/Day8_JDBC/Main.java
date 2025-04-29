package Day8_JDBC;
import java.sql.*;

public class Main {
    public static void main(String[] args)  {
        try {
            // Step 1:- Loading and Registering the driver.
            // Step 1(a) :- Load the driver.
            Class.forName("com.mysql.cj.jdbc.Driver");
            //            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2:- Establish the connection with the database
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/world",
                                                "root","tiger");
            if(con!=null){
                System.out.println("Connected Successfully !!");
            }

            // Step 3:- Create the statement object
            Statement st= con.createStatement();

            // Step 4:- Prepare, send and execute the query
            ResultSet rs= st.executeQuery("select * from city");

            // Step 5:- Process the ResultSet
            while(rs.next()){
                System.out.println(rs.getInt("ID")+"\t"+
                        rs.getString("Name")+"\t"+
                        rs.getString("CountryCode")+"\t"+
                        rs.getString("District")+"\t"+
                        rs.getInt("Population"));
            }

            // Step 6:- Close the connection
            con.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
