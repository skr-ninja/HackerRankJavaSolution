package extra.semaphore;

import java.util.concurrent.Semaphore;

public class ConSemaphore extends Thread {
    Semaphore semaphore;
    String threadName;

    ConSemaphore(Semaphore semaphore, String thread) {
        super();
        this.semaphore = semaphore;
        this.threadName = thread;
    }

    @Override
    public void run() {
        System.out.println(threadName + " is a waiting for permit");

        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(threadName + " get a permit");
        for (int i = 0; i < 2; i++) {
            boolean b = semaphore.hasQueuedThreads();
            if (b) {
                System.out.println("Length of Queue: " + semaphore.getQueueLength());
            }

            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println(threadName + " releases the permit.");

        semaphore.release();

    }
}
