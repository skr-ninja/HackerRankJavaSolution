package extra.thread;

import java.util.List;
import java.util.stream.IntStream;

public class TestThread {
    public static final List<Integer> numbersList= IntStream.range(0, 10).boxed().toList();

    public static void main(String[] args) {

        Odd odd = new Odd();
        Even even = new Even();
        even.start();
        odd.start();

    }
}
