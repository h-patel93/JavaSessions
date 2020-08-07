package OopConcepts;

public class RunTimePolymorphism {
    public static void main(String args[]) {
        Poly p = new Poly();
        Run r = new Run();

        Poly c;
        c=r;
        c.show(); //Runtime Polymorphism

    }
}

    class Poly
    {
        public void show()
        {
            System.out.println("in Poly show");
        }
    }
    class Run extends Poly
    {
        public void show()
        {
            System.out.println("in Run show");
        }
    }

