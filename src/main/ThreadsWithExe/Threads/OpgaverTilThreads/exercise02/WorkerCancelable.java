package ThreadsWithExe.Threads.OpgaverTilThreads.exercise02;


class WorkerCancelable implements Runnable {
    boolean keepRunning = true;
    Thread thread;

    public void run() {
        thread = Thread.currentThread();
        while (keepRunning) {
            for (int i = 0; i < 3; i++) {

                try {
                    Thread.sleep(5_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hello");
            }


            try {
                Thread.sleep(2_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Done");
            cancel();
        }


    }

    public void cancel() {
        keepRunning = false;
    }
}

