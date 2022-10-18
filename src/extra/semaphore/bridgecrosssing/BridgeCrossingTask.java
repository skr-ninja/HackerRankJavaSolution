package extra.semaphore.bridgecrosssing;

import java.util.concurrent.Semaphore;

public class BridgeCrossingTask implements Runnable {

    Semaphore signal;

    BridgeCrossingTask(Semaphore signal) {
        this.signal = signal;
    }

    @Override
    public void run() {

        System.out.println("Train " + Thread.currentThread().getName() + " Reached at train bridge and waiting for signal.");

        try {
            signal.acquire();
            System.out.println("Train " + Thread.currentThread().getName() + " got signal, is passing and will take 10 sec");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.interrupted();
        }
        finally {
            signal.release();
            System.out.println("Train " + Thread.currentThread().getName() + " is passed.");
        }

    }
}
