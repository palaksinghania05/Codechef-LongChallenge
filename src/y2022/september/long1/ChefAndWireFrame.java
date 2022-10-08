/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 09-09-2022
 */

package y2022.september.long1;

import java.util.Scanner;

public class ChefAndWireFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int X = sc.nextInt();
            int area = N*2+M*2;
            System.out.println(area*X);
            T--;
        }
    }
}
