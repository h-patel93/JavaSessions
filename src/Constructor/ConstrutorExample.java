package Constructor;

public class ConstrutorExample {


    public static void main(String args[])
    {
        ConstrutorExample obj = new ConstrutorExample();
        ConstrutorExample obj1 = new ConstrutorExample(5);


    }

    public ConstrutorExample()
    {
        System.out.print("default Constructor call");


    }

    public ConstrutorExample(double a)
    {
        System.out.print("parametrized constructor called");
    }


}
