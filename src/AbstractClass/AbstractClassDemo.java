package AbstractClass;

public class AbstractClassDemo {
    public static void main(String args[])
    {
        Ademo c = new Cdemo();
        c.show();

    }


}
   abstract class Ademo
    {
        public void show()
        {
            System.out.println("showing in Ademo");
        }
        public abstract void display();
        public abstract void delete();

    }
    abstract class Bdemo extends Ademo
    {
        public void show()
        {
            super.show();
            System.out.println("showing in Bdemo");
        }
        public void display()
        {
            System.out.println("displaying");

        }
        public abstract void delete();
    }
   class Cdemo extends Bdemo
   {
       public void delete()
       {
           System.out.println("Deleting");
       }
   }