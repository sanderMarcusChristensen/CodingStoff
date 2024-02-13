package ThreadsWithExe.Threads.OpgaverTilThreads;

public class Tråd1 implements Runnable{
    @Override
    public void run() {

        for(long i = 0; i < 1000000000; i++ ){
            System.out.println( " From T1 : " + i);
        }

    }
}
