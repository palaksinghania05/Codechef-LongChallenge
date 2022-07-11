/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 11-07-2022
 */

//Bidding
package y2022.july.long1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int result = Math.max(A, Math.max(B,C));
            if(result==A)
                System.out.println("Alice");
            else if(result==B)
                System.out.println("Bob");
            else
                System.out.println("Charlie");
            T--;
        }
    }
}
