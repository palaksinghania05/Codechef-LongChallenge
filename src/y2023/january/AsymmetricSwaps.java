/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 17-01-2023
 */

package y2023.january;

import java.util.Arrays;
import java.util.Scanner;

public class AsymmetricSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[2 * N];
            for (int i = 0; i < 2 * N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int min = Integer.MAX_VALUE;
            for (int i = 2 * N - 1; i >= N - 1; i--) {
                min = Math.min(min, (arr[i] - arr[i - N + 1]));
            }
            System.out.println(min);
            T--;
        }
    }
}
