/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 09-10-2022
 */

package y2022.october.long1;

import java.util.Scanner;

public class BuildingRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(A/X<B/Y)
                System.out.println("Chef");
            else if(A/X>B/Y)
                System.out.println("Chefina");
            else
                System.out.println("Both");
            T--;
        }
    }
}
