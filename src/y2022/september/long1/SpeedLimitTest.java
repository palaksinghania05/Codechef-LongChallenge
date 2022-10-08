/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 09-09-2022
 */

package y2022.september.long1;

import java.util.Scanner;

public class SpeedLimitTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int X = sc.nextInt();
            int B = sc.nextInt();
            int Y = sc.nextInt();
            double speedA = ((double)A)/X;
            double speedB = ((double)B)/Y;
            if(speedA>speedB)
                System.out.println("ALICE");
            else if(speedB>speedA)
                System.out.println("BOB");
            else
                System.out.println("EQUAL");
            T--;
        }
    }
}
