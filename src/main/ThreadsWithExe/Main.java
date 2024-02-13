package ThreadsWithExe;

import ThreadsWithExe.Threads.Task1;
import ThreadsWithExe.Threads.Task3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] arges) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        System.out.println("Hello gamer");

        String name = Thread.currentThread().getName();
        System.out.println("Thread name: " + name);

        for (int i = 0; i < 10; i++) {
            executorService.submit(new Task1());        //Makes a thread and run's it

        }
        executorService.submit(new Task2Exe());

        Task3 task3 = new Task3();
        executorService.submit(new Task3());


        Thread.sleep(8_000);        //makes to wait 8 sek


        System.out.println("Stopping the main thread");     // Main will run as we are used to

        System.out.println("Killing Task 3 - from the outside");
        task3.stopTask();
        executorService.shutdown();     //always remember to shut down your executorService




             /*


        Task1 task1 = new Task1();
        Thread thread1 = new Thread(task1);              // Thread takes a Runnable class
        thread1.start();                                 // this will run in the background

        Task2 task2 = new Task2();
        Thread thread2 = new Thread(task2);
        thread2.start();

         */


    }
}
