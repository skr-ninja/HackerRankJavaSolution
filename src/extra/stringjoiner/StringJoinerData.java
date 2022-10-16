package extra.stringjoiner;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerData {

    public static void main(String[] args) {

        ArrayList<String> data = new ArrayList<>();
        data.add("Sunil");
        data.add("John");
        data.add("Marry");
        data.add("Tom");
        data.add("Harry");
        data.add("Peter");

        System.out.println(data);

        StringJoiner stringJoiner = new StringJoiner(",");

        stringJoiner.setEmptyValue("Hello, I am string joiner (Empty) ");
        stringJoiner.add(data.get(0)).add(data.get(1));
        System.out.println(stringJoiner);
    }
}
