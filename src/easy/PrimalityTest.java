package easy;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String s1= scanner.next();
        BigInteger bigInteger=new BigInteger(s1);
        if(bigInteger.isProbablePrime(1)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        scanner.close();
    }
}
