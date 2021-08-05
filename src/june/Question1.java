//COCONUT

package june;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int A = sc.nextInt();
                int B = sc.nextInt();
                int type1 = A / x;
                int type2 = B / y;
                System.out.println(type1 + type2);
            }
        }
    }
}
