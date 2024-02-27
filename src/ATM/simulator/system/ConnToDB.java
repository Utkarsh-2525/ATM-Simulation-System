package ATM.simulator.system;

import java.sql.*;
public class ConnToDB
{
    Connection c;
    Statement st;
    public ConnToDB()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","SQLum25.");
            st=c.createStatement();
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
}
