package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Java2dArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];
        List<Integer> values = new ArrayList<>();

        for (int i = 0; i < 6; i++)
        {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++)
            {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
                if(i - 2 >= 0 && j - 2 >= 0)
                {
                    int firstRow = (arr[i][j])+(arr[i][j-1])+(arr[i][j-2]);
                    int secondRow = arr[i-1][j-1];
                    int thirdRow = arr[i-2][j]+arr[i-2][j-1]+arr[i-2][j-2];
                    values.add(firstRow+secondRow+thirdRow);
                }
            }
        }
        System.out.println(Collections.max(values));
        scanner.close();
    }
}
