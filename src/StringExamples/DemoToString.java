package StringExamples;

public class DemoToString {
    public static void main(String args[])
    {
        Demo1 d = new Demo1("Harsh",22);
        System.out.println(d);
    }
}


class Demo1
{
    String name;
    int rollNo;

    public Demo1(String name, int rollNo)
    {
        this.name=name;
        this.rollNo=rollNo;
    }

    @Override
    public String toString() {
        return "Demo1{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
