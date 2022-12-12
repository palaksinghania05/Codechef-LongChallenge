/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 11-12-2022
 */

package y2022.december;

import java.util.Scanner;

public class DivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long K = sc.nextLong();
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextLong();
            }
            long result = 1;
            for (int i = 0; i < N; i++) {
                result = (result * arr[i]) % K;
            }
            if (result == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
