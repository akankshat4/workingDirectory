package classes;

public class TestThread {
    public static int counter = 0;
    public static void main(String args[]){
        //define run method which is used to declare the threads
        Runnable runnable = ()->{
            counter++;
            System.out.println("This is thread"+counter);
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}
