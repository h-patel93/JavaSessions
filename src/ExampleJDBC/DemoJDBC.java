package ExampleJDBC;
import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {
        String url = "";
        String username = "root";
        String pass = "Welcome1";
        String Query = "select * from demo";
        String queryinsert="insert into demo values(?,?)";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(   "jdbc:mysql://localhost:3306/Ziedfinalproject?autoReconnnect=true&useSSL=false", username, pass);
        PreparedStatement st = con.prepareStatement(queryinsert);
        st.setString(1,"Manoj");

        st.setInt(2,35);
        int i = st.executeUpdate();
        System.out.println(i + "row/s affected  ");
        //Select query

       /* ResultSet rs = st.executeQuery(Query);


        while(rs.next())
        {
            System.out.println(rs.getString("name"));
            System.out.println(rs.getInt("rollno"));
        }*/

        st.close();
        con.close();



    }
}


