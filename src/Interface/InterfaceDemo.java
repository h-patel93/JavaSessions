package Interface;

public class InterfaceDemo {
    public static void main(String arg[])
    {
        Idemo2 obj = new Idemo2();
        //obj.display();
        B a = new Idemo2();
     a.display();
     E e = new E()
     {
         @Override
         public void move() {
             System.out.println("moving");
         }

     };
        e.move();

        IJ ij = new IJ();
        ij.fight();
        ij.take();

    }


}

interface I
{
    default void fight() //java 8 new feature
    {
        System.out.println("fighting in I");
    }
    default void take()
    {
        System.out.println("taking");
    }
}
interface J
{
    default void fight()
    {
        System.out.println("fighting in J");
    }
}
class IJ implements I,J //java 8 new feature
{
    @Override
    public void fight() {
        System.out.println("fighting in IJ CLASS");
    }
}
interface E
{
    void move();
}
interface C
{
    void dance();
}
interface D extends C
{
    void sleep();
}
interface A
{
    void show();
}
interface B extends A
{
    void display();
}
abstract class Idemo implements B
{
    @Override
    public void display() {
        System.out.println("in display");
    }
}
class Idemo2 extends Idemo implements D{
    @Override
    public void show() {

    }
    public void sleep()
    {
        System.out.println("sleeping");
    }
    public void dance()
    {
        System.out.println("dancing");
    }
}