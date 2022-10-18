package extra.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(3, true);

        System.out.println("Is fairness enabled: " + semaphore.isFair());

        semaphore.tryAcquire(2);

        System.out.println("Is fairness enabled: " + semaphore.isFair());

        System.out.println("Available permits: " + semaphore.availablePermits());

        System.out.println("Number of permits drain by Main thread: " + semaphore.drainPermits());

        semaphore.release(1);

        ConSemaphore mt1 = new ConSemaphore(semaphore, "A");
        ConSemaphore mt2 = new ConSemaphore(semaphore, "B");

        mt1.start();
        mt2.start();
        System.out.println(semaphore.toString());

        try {
            mt1.join();
            mt2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
