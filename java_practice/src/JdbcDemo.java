import java.sql.*;  
// Imports all JDBC classes like Connection, Statement, ResultSet

public class JdbcDemo
{
    public static void main(String[] args) throws Exception
    {
        // URL tells where database is located
        // jdbc:mysql → driver type
        // localhost:3306 → server + port
        // studentdb → database name
        String url = "jdbc:mysql://localhost:3306/studentdb";

        // Database login credentials
        String username = "root";
        String password = "SAI123kum@r456";

        // Step 1: Establish connection with database
        Connection con =
                DriverManager.getConnection(url, username, password);

        // Step 2: Create statement object to send SQL query
        Statement st = con.createStatement();

        // Step 3: SQL query (fetch all records from student table)
        String sql = "SELECT * FROM student";

        // Step 4: Execute query and store result in ResultSet
        ResultSet rs = st.executeQuery(sql);

        // Step 5: Read data row by row using while loop
        while(rs.next())
        {
            // Get values from each column of current row
            int id = rs.getInt("id");
            String name = rs.getString("name");

            // Print data
            System.out.println(id + " " + name);
        }

        // Step 6: Close all connections (important for memory)
        rs.close();
        st.close();
        con.close();
    }
}
