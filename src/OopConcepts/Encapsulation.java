package OopConcepts;

public class Encapsulation {




    public static void main(String args[])
    {
        Demo d = new Demo();
        d.setI(5);
        System.out.println(d.getI());
        d.setName("Harsh");
        System.out.println(d.getName());


    }
}

class Demo
{
    private int i;
    private String name;

    public void setI(int j)
    {
        i=j;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public int getI()
    {
        return i;
    }



}