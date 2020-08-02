package Static;

public class ObjectCounter {

    static int i;
    public ObjectCounter()
    {
        i++;
    }

    public static void main (String args[])
    {
        ObjectCounter obj = new ObjectCounter();
        ObjectCounter obj2= new ObjectCounter();

        System.out.println(i);
    }
}
