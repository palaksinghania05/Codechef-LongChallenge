/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 12-08-2022
 */

package y2022.august.long1;

import java.util.Scanner;

public class SaleSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            if(X<=100)
                System.out.println(X);
            else if(X>100 && X<=1000)
                System.out.println(X-25);
            else if(X>1000 && X<=5000)
                System.out.println(X-100);
            else
                System.out.println(X-500);
            T--;
        }
    }
}
