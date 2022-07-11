package y2021.october;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int A = sc.nextInt();
                int B = sc.nextInt();
                int C = sc.nextInt();
                int D = sc.nextInt();
                if(A<=D && (A+B)>D)
                    System.out.println(3);
                else if((A+B)<=D && (A+B+C)>D)
                    System.out.println(2);
                else
                    System.out.println(1);
                T--;
            }
        }
    }
}
