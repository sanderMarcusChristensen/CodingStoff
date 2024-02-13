package ThreadsWithExe.Threads.OpgaverTilThreads.exercise02;

public class ThreadExercise02 {

    public static void main(String[] args) throws InterruptedException {
        WorkerCancelable worker = new WorkerCancelable();
        Thread t = new Thread(worker);
        t.start();

        //System.out.println("DONE");
    }
}
