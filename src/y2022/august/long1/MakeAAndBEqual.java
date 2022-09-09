/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 13-08-2022
 */

package y2022.august.long1;

import java.util.Scanner;

public class MakeAAndBEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A==B)
                System.out.println("YES");
            else {
                if (A > B) {
                    while (B < A)
                        B *= 2;
                } else {
                    while (A < B)
                        A *= 2;
                }
                if (A == B)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            T--;
        }
    }
}
