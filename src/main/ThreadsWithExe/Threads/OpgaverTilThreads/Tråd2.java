package ThreadsWithExe.Threads.OpgaverTilThreads;

public class Tråd2 implements Runnable{
    @Override
    public void run() {

        for(int i = 0; i < 5; i++){

            System.out.println("Form T2: " + i);
            try {
                Thread.sleep(2_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
