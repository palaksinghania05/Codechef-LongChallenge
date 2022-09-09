/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 12-08-2022
 */

package y2022.august.long1;

import java.util.Scanner;

public class MaximumSubmissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            System.out.println(X*60/30);
            T--;
        }
    }
}
