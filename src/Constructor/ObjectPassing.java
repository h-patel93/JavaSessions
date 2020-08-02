package Constructor;

 class Printer
 {
public void print(Paper p)
{
    p.setText("hello");
}
 }

 class Paper
 {
     String text;
     public void setText (String s )
     {
         text=s;

     }
     public String getText()
     {
         return text;
     }
 }

public class ObjectPassing {

     public static void main(String args[])
     {
         Paper p = new Paper();
         Printer np = new Printer();


         np.print(p);
         System.out.println(p.getText());
         p.setText("Hello World");


         System.out.println(p.getText());

     }


}
