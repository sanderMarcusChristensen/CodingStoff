package ThreadsWithExe.Threads;

public class Task1 implements Runnable
{

    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        System.out.println("Thread name: " + name );

        System.out.println( name + ": Downloading from the internet.....");

        try {
            Thread.sleep(5_000);                            // How long we want the thread to wait
            System.out.println( name + " finished downloading");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
