package SingletonDemo;

public class SingletonClassDemo {
    public static void main(String[] args) {




        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Abc a = Abc.getObject();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Abc b = Abc.getObject();
            }
        });
        t1.start();
        t2.start();

    }
}
class Abc
{
    int i =10;
    static Abc obj1 ;
    private Abc()
    {
        System.out.println("Instance Created");
    }
    //Eager and Lazy way

   // static public synchronized Abc getObject() // Synchronizing whole method cosumed resources too much
   static public  Abc getObject()    //Double Chcked Locking
    {
        if(obj1==null) {
            synchronized (Abc.class) {
                if (obj1 == null) {
                    obj1 = new Abc();
                }
            }

        }
        return obj1;
    }
}
