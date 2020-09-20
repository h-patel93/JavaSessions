package ExampleJDBC;
import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {
        String url = "";
        String username = "root";
        String pass = "Welcome1";
        String Query = "select * from demo";
        String queryinsert="insert into demo values('?',?)";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(   "jdbc:mysql://localhost:3306/Ziedfinalproject?autoReconnnect=true&useSSL=false", username, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(Query);
        while(rs.next())
        {
            System.out.println(rs.getString("name"));
            System.out.println(rs.getInt("rollno"));
        }
        st.close();
        con.close();



    }
}
