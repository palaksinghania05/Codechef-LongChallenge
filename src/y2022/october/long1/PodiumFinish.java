/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 08-10-2022
 */

package y2022.october.long1;

import java.util.Scanner;

public class PodiumFinish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A+B);
            T--;
        }
    }
}
