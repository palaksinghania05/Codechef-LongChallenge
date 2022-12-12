/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 10-12-2022
 */

package y2022.december;

import java.util.Scanner;

public class GoodInvestmentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X >= 2 * Y)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
