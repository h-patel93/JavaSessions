package AnnotationsDemo;

import java.util.ArrayList;

public class AnnotationExample {
    public static void main(String[] args) {
        B b  = new B();
        b.show();
        @SuppressWarnings("Unchecked")
        ArrayList<Object> values = new ArrayList<>();

    }

}
@FunctionalInterface
interface Abc
{
    void Show();
    //void Display();

}
class A
{   @Deprecated
    public void show()
    {
        System.out.println("A");
    }
}
class B extends A
{
   @Override
    public void show()
    {
        System.out.println("B");
    }
}
