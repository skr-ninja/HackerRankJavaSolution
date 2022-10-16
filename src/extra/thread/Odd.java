package extra.thread;

public class Odd extends Thread {

    public void run() {
        synchronized (TestThread.numbersList) {
            for (int i = 1; i <=TestThread.numbersList.size(); i++) {
                if (i % 2 == 1) {
                    System.out.println("ODD:  " + i);
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
