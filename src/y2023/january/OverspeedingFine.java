/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 16-01-2023
 */

package y2023.january;

import java.util.Scanner;

public class OverspeedingFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            if (X <= 70)
                System.out.println(0);
            else if (X > 70 && X <= 100)
                System.out.println(500);
            else
                System.out.println(2000);
            T--;
        }
    }
}
