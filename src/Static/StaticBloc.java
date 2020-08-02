package Static;


public class StaticBloc {
    static String s = "";

    public StaticBloc()
    {
        System.out.println("Constructor called");
    }
    public static void main(String args[])
    {
        StaticBloc obj = new StaticBloc();
        System.out.println("Value of s "+s);


    }
    static
    {
        s = "Hello";
        System.out.println("static block ");
    }
}
