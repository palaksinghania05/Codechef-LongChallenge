/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 23-07-2022
 */

package y2022.july.long2;

import java.util.Scanner;

public class ToDivideOrToNotDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int N = sc.nextInt();
            if(A%B==0)
                System.out.println(-1);
            else {
                while (N > 0) {
                    if (N % A == 0 && N % B != 0) {
                        System.out.println(N);
                        break;
                    } else {
                        N++;
                    }
                }
            }
            T--;
        }
    }
}
