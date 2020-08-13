package ObjectCloningDemo;

public class ObjectCloning {

    public static void main(String args[]) throws CloneNotSupportedException {
        //shallow
        A a = new A();
        a.i=5;
        a.j=6;
        A b = a;

        b.i=4;
        System.out.println(a);
        System.out.println(b);

        //deep
        A d = new A();
        d.i=a.i;
        d.j=a.j;
        d.i=11;
        System.out.println(d);

        //Object Cloning
        A c= (A) a.clone();
        System.out.println(c);
        c.i=9;
        c.j=10;
        System.out.println(c);
    }


}
class A implements Cloneable
{


    int i,j;
    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}