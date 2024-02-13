package ThreadsWithExe.Threads;

public class Task3 implements Runnable {

    private boolean running = true;

    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        System.out.println("Thread name: " + name );

        System.out.println(" TASK 3 : Downloading from the internet.....");
        int i = 0;

        try {

            while(running){
                Thread.sleep(1_000);                    // how long we want the thread to wait
                System.out.println(" TASK 3 counter: " + i++);

            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void stopTask(){
        running = false;
    }
}

