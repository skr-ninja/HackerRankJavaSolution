package extra.thread;

public class Even extends Thread {

    public void run() {
        synchronized (TestThread.numbersList) {
            for (int i = 1; i <=TestThread.numbersList.size(); i++) {
                if (i % 2 == 0) {
                    System.out.println("EVEN: " + i);
                    TestThread.numbersList.notify();
                } else {
                    try {
                        TestThread.numbersList.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
