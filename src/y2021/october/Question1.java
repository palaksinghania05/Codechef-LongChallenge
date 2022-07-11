package y2021.october;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int A = sc.nextInt();
                int B = sc.nextInt();
                if(A>0 && B>0)
                    System.out.println("Solution");
                else if(A==0)
                    System.out.println("Liquid");
                else
                    System.out.println("Solid");
                T--;
            }
        }
    }
}
