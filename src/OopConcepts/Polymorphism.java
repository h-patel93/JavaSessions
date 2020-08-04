package OopConcepts;

public class Polymorphism {
    public static void main(String args[])
    {
        Bca b = new Bca();
        b.print();
        b.print(5);
        b.print(6.0);
    }
}
//overloading and overriding
class Abc
{
    public void print()
    {
        System.out.println("Abc class print method without parameter");
    }
    public void print(int i)
    {
        System.out.println("Abc class print method WITH PARAMETER"+i);
    }
}
class Bca extends Abc
{
    public void print(int j)
    {
        System.out.println("BCA class called " +j);
    }
    public void print(double j)
    {
        System.out.println("BCA class called " +j);
    }

        }
