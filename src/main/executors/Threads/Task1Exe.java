package executors.Threads;

public class Task1Exe implements Runnable
{

    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        System.out.println("Thread name: " + name );

        System.out.println(" TASK 1 : Downloading from the internet.....");

        try {
            Thread.sleep(2_000);                            // how long we want the thread to wait
            System.out.println("TASK 1: finished downloading");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
