/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 16-01-2023
 */

package y2023.january;

import java.util.Scanner;

public class NegativeProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int pos = 0, neg = 0;
            if (A > 0)
                pos++;
            else
                neg++;
            if (B > 0)
                pos++;
            else
                neg++;
            if (C > 0)
                pos++;
            else
                neg++;
            if (pos >= 1 && neg >= 1)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
