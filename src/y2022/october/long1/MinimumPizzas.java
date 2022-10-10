/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 08-10-2022
 */

package y2022.october.long1;

import java.util.Scanner;

public class MinimumPizzas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            if((N*X)%4==0)
                System.out.println((N*X)/4);
            else
                System.out.println((N*X)/4 + 1);
            T--;
        }
    }
}
