/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 11-07-2022
 */

//Pass The Exam
package y2022.july.long1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if(A>=10 && B>=10 && C>=10 && A+B+C>=100)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
            T--;
        }
    }
}
