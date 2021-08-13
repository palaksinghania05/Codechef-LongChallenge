//PROBLEM DIFFICULTIES

package august;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            for(int T = sc.nextInt(); T > 0; --T) {
                int[] arr = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
                Arrays.sort(arr);
                if (arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3]) {
                    System.out.println(0);
                } else if ((arr[0] != arr[1] || arr[1] != arr[2]) && (arr[1] != arr[2] || arr[2] != arr[3])) {
                    System.out.println(2);
                } else {
                    System.out.println(1);
                }
            }
        }
    }
}
