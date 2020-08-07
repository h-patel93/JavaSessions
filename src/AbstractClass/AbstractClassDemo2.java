package AbstractClass;

public class AbstractClassDemo2 {

    public static void main(String args[])
    {
        Iphone i = new Iphone();
        Samsung s = new Samsung();
        show(s);

       }
    public static void show(Phone p)
    {
        p.showConfig();
    }
    //public static void show(Samsung s)
    //{
      //  s.showConfig();
    //}

}

 abstract class Phone
{
    public abstract  void showConfig();


}

class Iphone extends Phone
{
    public void showConfig()
    {
        System.out.println("iphone config");
    }

}
class Samsung extends Phone
{
    public void showConfig()
    {
        System.out.println("samsung config");
    }
}