//OLYMPICS RANKING

package august;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            for (int T = sc.nextInt(); T > 0; --T) {
                int G1 = sc.nextInt();
                int S1 = sc.nextInt();
                int B1 = sc.nextInt();
                int G2 = sc.nextInt();
                int S2 = sc.nextInt();
                int B2 = sc.nextInt();
                if (G1 + S1 + B1 > G2 + S2 + B2) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            }
        }
    }
}
