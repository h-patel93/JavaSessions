package OopConcepts;

public class InstantiatingObject  {
    public static void main(String args[])  throws Exception
    {
        Class s = Class.forName("OopConcepts.Encapsulation");
        Encapsulation e = (Encapsulation) s.newInstance();
        e.show();


    }
}
