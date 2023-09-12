public class LambdaExpressionExampleCreatingThread {
    public static void main(String[] args) {
        //Thread Example without lambda

        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("The thread is running....... ");
            }
        };

        Thread t1=new Thread(r1); //thread is
        t1.start();


        //Thread Example with lambda

        Runnable r2=()->{
            System.out.println("Thread 2 is running");

        };

        Thread t2=new Thread(r2);
        t2.start();

    }
}
