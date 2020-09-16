package InnerClassDemo;
//Member Inner Class
//Nested Inner class
//Static inner class
//with Lambda expression
public class DemoInnerClass {
    public static void main(String[] args) {
        A a = new A();
    A.B b = a.new B();
    b.show();
    A.C c = new A.C()
    {
        public void show()
        {
            System.out.println("in main C");
        }
    };
    c.show();

    D d = () -> System.out.println("in D");





    }
}

class A
{
    int rollNo;
    String name;

    class B
    {

        public void show()
        {
            System.out.println("hello in B");

        }
    }
    static class C
    {
        public void show()
        {
            System.out.println("in C");
        }
    }
}
interface D
{
    void help();
}
