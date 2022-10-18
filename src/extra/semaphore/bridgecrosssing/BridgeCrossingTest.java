package extra.semaphore.bridgecrosssing;

import java.util.concurrent.Semaphore;

public class BridgeCrossingTest {
    public static void main(String[] args) {
        Semaphore token=new Semaphore(1);
        BridgeCrossingTask bridgeCrossingTask=new BridgeCrossingTask(token);
        new Thread(bridgeCrossingTask, "Dakshin Express").start();
        new Thread(bridgeCrossingTask, "Taj Express").start();
        new Thread(bridgeCrossingTask, "Shatabdi").start();
        new Thread(bridgeCrossingTask, "Rajdhani").start();
    }
}
