package ThreadingDemo;

public class ThreadingLambdaExp {
    public void show(String str) {
        for (int i = 1; i < 5; i++) {
            System.out.println(str);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }


    public static void main(String[] args) {
        new Thread(() -> new ThreadingLambdaExp().show("hi")).start();


        new Thread(() -> new ThreadingLambdaExp().show("hello")).start();


    }
}



