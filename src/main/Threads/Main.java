package Threads;

public class Main {

    public static void main(String[] arges) throws InterruptedException {

        System.out.println("Hello gamer");

        String name = Thread.currentThread().getName();
        System.out.println("Thread name: " + name );


        Task1 task1 = new Task1();
        Thread thread1 = new Thread(task1);              // Thread takes a Runnable class
        thread1.start();                                 // this will run in the background

        Task2 task2 = new Task2();
        Thread thread2 = new Thread(task2);
        thread2.start();

        Task3 task3 = new Task3();
        Thread thread3 = new Thread(task3);
        thread3.start();

        Thread.sleep(8_000);


        System.out.println("Stopping the main thread");     // Main will run as we are used to

        System.out.println("Killing Task 3 - from the outside");
        task3.stopTask();


    }
}
