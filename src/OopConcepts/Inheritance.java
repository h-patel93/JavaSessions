package OopConcepts;

public class Inheritance {
    public static void main(String args[])
    {
        A b = new B("Harsh");

    }
}
class A
{
    public A()
    {
        System.out.println("in default cont A");
    }
    public A(int i)
    {
        System.out.println("in int const A");
    }

}
class B extends A
{
    public B()
    {
        System.out.println("in default cont b");
    }
    public B(String i)
    {
        System.out.println("in int cont b");
    }
}
