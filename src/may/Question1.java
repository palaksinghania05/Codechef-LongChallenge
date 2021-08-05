//SOLUBILITY

package may;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t > 0) {
                short X = sc.nextShort();
                short A = sc.nextShort();
                byte B = sc.nextByte();
                int part = (100 - X) * B;
                int result = (A + part) * 10;
                System.out.println(result);
                t--;
            }
        }
    }
}
