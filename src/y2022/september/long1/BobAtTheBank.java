/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 09-09-2022
 */

package y2022.september.long1;

import java.util.Scanner;

public class BobAtTheBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int W = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            int each = X-Y;
            System.out.println(W+each*Z);
            T--;
        }
    }
}
