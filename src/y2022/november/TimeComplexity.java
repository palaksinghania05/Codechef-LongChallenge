/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 12-11-2022
 */

package y2022.november;

import java.util.Scanner;

public class TimeComplexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A>B)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
