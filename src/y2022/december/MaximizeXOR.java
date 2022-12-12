/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 11-12-2022
 */

package y2022.december;

import java.util.Scanner;

public class MaximizeXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String A = sc.next();
            String B = sc.next();
            int zeroA = 0, oneA = 0;
            int zeroB = 0, oneB = 0;
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) == '0')
                    zeroA++;
                else
                    oneA++;
                if (B.charAt(i) == '0')
                    zeroB++;
                else
                    oneB++;
            }
            int ans = Math.min(oneA, zeroB) + Math.min(zeroA, oneB);
            for (int i = 0; i < ans; i++) {
                System.out.print(1);
            }
            for (int i = ans; i < A.length(); i++) {
                System.out.print(0);
            }
            System.out.println();
            T--;
        }
    }
}
