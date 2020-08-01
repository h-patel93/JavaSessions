package VarArgs;

public class VarArgs {
    public static void main(String[] args){
Display d = new Display();
       d.display(10);

    }

    static class Display
    {
        public  void display(int ... i)
        {
            for (int j:i
                 ) {
                System.out.println(j);
            }

        }
        public void display(int i)
        {
            System.out.println("i in display method with 1 argument"+i);
        }
    }
}
