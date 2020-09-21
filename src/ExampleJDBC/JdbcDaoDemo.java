package ExampleJDBC;



import java.sql.*;

public class JdbcDaoDemo {
    public static void main(String[] args) throws Exception {
        StudentDao dao = new StudentDao();
       // Students s1 = dao.getStudent(35);
       // System.out.println(s1.name);

        Students s2 = new Students();
        s2.rollNo=45;
        s2.name = "joker";
        dao.addStudent(s2);

    }
}
class StudentDao
{

    Connection con ;
    Students s = new Students();
    public void connect() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ziedfinalproject?autoReconnnect=true&useSSL=false", "root", "Welcome1");

    }
    public void closeConnect() throws Exception
    {
        con.close();


    }

    public Students getStudent(int rollNo) throws Exception
    {
    connect();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select name from demo where rollno ="+rollNo);
        rs.next();
        s.name = rs.getString(1);

       s.rollNo=rollNo;
        return s;
    }
    public void addStudent(Students s) throws Exception
    {
        connect();
        PreparedStatement pst = con.prepareStatement("insert into demo values (?,?)");
        pst.setString(1,s.name);
        pst.setInt(2,s.rollNo);
      int i =  pst.executeUpdate();
        System.out.println(i + "rows updated");
       pst.close();
       con.close();


    }
}

class Students
{
    int rollNo;
    String name;
}
