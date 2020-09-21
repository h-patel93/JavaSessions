package ExampleJDBC;

public class DemoJDBCpart2 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
       Class.forName("com.mysql.jdbc.Driver");


Pqr p = new Pqr();
    }
}
class Pqr
{
    static
    {
        System.out.println("in static");
    }
    //instance block
    {
        System.out.println("in instance");
    }
}