package ThreadsWithExe.Threads.OpgaverTilThreads;

public class Concurrency {

    public static void main(String[] arges) throws InterruptedException {

        CarOne t1 = new CarOne();
        Thread thread1 = new Thread(t1);
        thread1.start();


        CarToo t2 = new CarToo();
        Thread thread2 = new Thread(t2);
        thread2.start();


        CarThree t3 = new CarThree();
        Thread thread3 = new Thread(t3);
        thread3.start();


    }

}
