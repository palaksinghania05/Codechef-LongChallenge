//AIRLINE RESTRICTIONS

package september;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int A = sc.nextInt();
                int B = sc.nextInt();
                int C = sc.nextInt();
                int D = sc.nextInt();
                int E = sc.nextInt();
                if((A+B<=D && C<=E) || (A+C<=D && B<=E) || (B+C<=D && A<=E))
                    System.out.println("YES");
                else
                    System.out.println("NO");
                T--;
            }
        }
    }
}
