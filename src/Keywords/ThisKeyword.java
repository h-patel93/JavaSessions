package Keywords;

public class ThisKeyword {
    public static void main(String args[])
    {
       Abc a = new Abc();
       a.show(10);
        System.out.println(a.display());
    }

}
class Abc
{
    private int i;
    public void show(int i)
    {
        this.i=i;
    }
    public int display()
    {
        return i;
    }
}
