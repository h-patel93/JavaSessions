package Keywords;

public class SuperKeyword {
    public static void main(String args[]) {
        B a = new B();
        a.show();
    }
    }

    class A
    {
        int j=10;

        public void show()
        {
            System.out.println("in A show ");
        }
        public  A()
    {
        System.out.println("in A CONST show");

    }
        public A(int i)
        {
            System.out.println("in A CONST show para i");

        }
    }
    class B extends A
    {
        int j=5;

        public void show()
        {
            super.show();
            System.out.println("in B show "+super.j);
        }

        public B()
        {
            super(5);
            System.out.println("in B CONST show");
        }
    }

