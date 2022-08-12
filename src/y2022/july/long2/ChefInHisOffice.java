/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 22-07-2022
 */

package y2022.july.long2;

import java.util.Scanner;

public class ChefInHisOffice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println(X*4+Y);
            T--;
        }
    }
}
