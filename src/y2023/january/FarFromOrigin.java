/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 17-01-2023
 */

package y2023.january;

import java.util.Scanner;

public class FarFromOrigin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X1 = sc.nextInt();
            int Y1 = sc.nextInt();
            int X2 = sc.nextInt();
            int Y2 = sc.nextInt();
            double alex = Math.sqrt(X1 * X1 + Y1 * Y1);
            double bob = Math.sqrt(X2 * X2 + Y2 * Y2);
            if (alex == bob) {
                System.out.println("EQUAL");
            } else if (alex > bob) {
                System.out.println("ALEX");
            } else {
                System.out.println("BOB");
            }
            T--;
        }
    }
}
