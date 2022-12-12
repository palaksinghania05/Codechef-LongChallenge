/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 10-12-2022
 */

package y2022.december;

import java.util.Scanner;

public class ReachFast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int K = sc.nextInt();
            int s = Math.abs(X - Y);
            if (s % K == 0)
                System.out.println(s / K);
            else
                System.out.println((s / K) + 1);
            T--;
        }
    }
}
