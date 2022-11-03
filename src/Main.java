import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        String[] strArray =
                {"Mohan", "Suresh", "Rituraj", "Dinesh", "Rohan", "Lily", "Ram", "Rakesh", "Prakash", "Ritesh"};


        List<String> list = Arrays.asList(strArray);

        List<String> mList = list.stream()
                .filter(x -> x.startsWith("R"))
                .collect(Collectors.toList());
        System.out.println(mList);

        mList.forEach(s -> System.out.println(s.length()));


    }
}