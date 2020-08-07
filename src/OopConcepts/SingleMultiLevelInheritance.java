package OopConcepts;

public class SingleMultiLevelInheritance {

    public static void main(String args[])
    {
        CC c = new CC();
        c.a=20;
        c.b=10;
        System.out.println(c.add());


        BB a = new CC();
        a.sub();

    }
}
class AA
{
    int a,b,sum;
    public int add()
    {
       sum=a+b;
       return sum;
    }
}
class BB extends AA
{
    int sub;
    public int sub()
    {
        sub=a-b;
        return sub;
    }
}
class CC extends BB
{ int mul;
    public int mul()
    {
        mul=a*b;
        return mul;
    }
}
