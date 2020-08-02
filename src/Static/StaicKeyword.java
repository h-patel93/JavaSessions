package Static;

public class StaicKeyword {

    static int i=0;
    int j=10;

    public static void print()
    {
        System.out.println("hello world static import ");
    }

    public  void display()
    {
        System.out.println("hello non static");
    }
    public static  void main(String args[])
    {
        System.out.println(i);
        StaicKeyword s = new StaicKeyword();
        System.out.println(s.j);
        StaicKeyword.print();
s.display();

    }

}
