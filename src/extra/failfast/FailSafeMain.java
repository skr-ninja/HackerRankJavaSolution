package extra.failfast;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeMain {

    public static void main(String[] args) {

        // FailFast();
        FailSafe();
    }

    public static void FailFast() {
        HashMap<String, String> failFastHashMap = new HashMap<>();
        failFastHashMap.put("mp", "morena");
        failFastHashMap.put("up", "agra");
        failFastHashMap.put("delhi", "delhi");
        failFastHashMap.put("goa", "goa");

        Iterator iterator = failFastHashMap.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(failFastHashMap.get(iterator.next()));

            // adding an element to Map
            // exception will be thrown on next call
            // of next() method.
            failFastHashMap.put("Istanbul", "Turkey");
        }
    }

    public static void FailSafe() {
        CopyOnWriteArrayList<String> strings = new CopyOnWriteArrayList<>();
        strings.add("sunil");
        strings.add("pankaj");
        strings.add("abhimanyu");
        strings.add("shubham");
        Iterator iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

        strings.add("Ram");

        System.out.println(strings);

        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("mp", "morena");
        concurrentHashMap.put("up", "agra");
        concurrentHashMap.put("delhi", "delhi");
        concurrentHashMap.put("goa", "goa");

        Iterator iterator1 = concurrentHashMap.keySet().iterator();

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());

            concurrentHashMap.put("Istanbul", "Turkey");
        }

        System.out.println(concurrentHashMap);
    }
}

