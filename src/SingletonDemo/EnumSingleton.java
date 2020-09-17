package SingletonDemo;

public class EnumSingleton {
    public static void main(String[] args) {
        Abcd a = Abcd.INSTANCE;
        Abcd b = Abcd.INSTANCE;

        a.i=5;
        System.out.println(a.i);
        System.out.println(b.i);

    }
}
enum Abcd
{
    INSTANCE;
    int i=10 ;

}