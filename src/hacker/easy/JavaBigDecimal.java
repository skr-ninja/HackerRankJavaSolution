package hacker.easy;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {
    public static void main(String[] args){
        BigDecimal bigDecimal1=new BigDecimal("56.22");
        BigDecimal bigDecimal2=new BigDecimal("56.22");

        if(bigDecimal1.equals(bigDecimal2)){
            System.out.println("Matched");
        }
        else{
            System.out.println("Not Matched");
        }

        // check greater then 0
        if(bigDecimal1.compareTo(BigDecimal.ZERO)>0){
            System.out.println("0");
        }

        BigDecimal bigDecimal=new BigDecimal("0.00");

        // check greater then 0
        if(bigDecimal.signum()==0){
            System.out.println("0.00");
        }

        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        // Write your code here
        Arrays.sort(s, 0, n, Collections.reverseOrder(new Comparator<String>() {
            public int compare(String s1, String s2) {
                BigDecimal b1 = new BigDecimal(s1);
                BigDecimal b2 = new BigDecimal(s2);
                return b1.compareTo(b2);

            }
        }));

        // Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

    }

