/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 14-11-2022
 */

package y2022.november;

import java.util.Scanner;

public class WaterMixing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(A==B)
                System.out.println("YES");
            else if((A-B)<0){
                if((A-B)+X<0)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }else{
                if((A-B)<=Y)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            T--;
        }
    }
}
