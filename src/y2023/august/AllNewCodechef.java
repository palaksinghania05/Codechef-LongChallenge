/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 01-09-2023
 */

package y2023.august;

import java.util.Arrays;
import java.util.Scanner;

public class AllNewCodechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if(X<Y)
          System.out.println("Old");
        else if(X>Y)
          System.out.println("New");
        else
          System.out.println("Same");
    }
}
