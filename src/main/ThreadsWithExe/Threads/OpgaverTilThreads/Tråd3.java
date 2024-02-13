package ThreadsWithExe.Threads.OpgaverTilThreads;

public class Tråd3 implements Runnable{
    @Override
    public void run() {

        for(int i = 10; i < 1000000000; i ++){
            System.out.println("Form T3: " + i);

            try {
                Thread.sleep(3_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
