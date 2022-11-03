package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SetMismatch {


    public static void main(String[] args) {

        int[] a = {1, 2, 2, 4, 5, 6, 7};
        //findNumberError(a);

        //System.out.println(Arrays.stream(data).count());

        findNumberErrorHashmap(a);
    }

    private static void findNumberErrorHashmap(int[] a) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;
        boolean dup = false;
        for (int i = 0; i < a.length; i++) {
           // System.out.println(a[i]);
            if (hashMap.containsKey(a[i])) {
                count = hashMap.get(a[i]);
                hashMap.put(a[i], count + 1);
            } else {
                hashMap.put(a[i], 1);
            }
        }

        //System.out.println(hashMap);

        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + " ");
                dup=true;
            }
        }

        // no duplicates present
        if(!dup){
            System.out.println("-1");
        }
    }


    public static int[] findNumberError(int[] arr) {
        int dup = -1, missing = -1;

        for (int i = 1; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }
            if (count == 2) {
                dup = i;
                System.out.println(dup);
            } else if (count == 0) {
                missing = i;
                System.out.println(missing);
            }
        }
        return new int[]{dup, missing};

    }
}
