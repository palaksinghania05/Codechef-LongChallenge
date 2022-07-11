/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 11-07-2022
 */

//Chef And Candies
package y2022.july.long1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int extra = N-X;
            if(extra<=0)
                System.out.println(0);
            else{
                if(extra%4==0)
                    System.out.println(extra/4);
                else
                    System.out.println((extra/4)+1);
            }
            T--;
        }
    }
}
