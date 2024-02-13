package ThreadsWithExe.Threads.OpgaverTilThreads;

public class Concurrency {

    public static void main(String[] arges) throws InterruptedException {

        Tråd1 t1 = new Tråd1();
        Thread thread1 = new Thread(t1);
        thread1.start();


        Tråd2 t2 = new Tråd2();
        Thread thread2 = new Thread(t2);
        thread2.start();


        Tråd3 t3 = new Tråd3();
        Thread thread3 = new Thread(t3);
        thread3.start();


    }

}
