package y2021.november;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int X = sc.nextInt();
                int Y = sc.nextInt();
                int A = sc.nextInt();
                int B = sc.nextInt();
                int K = sc.nextInt();
                for (int i = 0; i < K; i++) {
                    X+= A;
                    Y+= B;
                }
                if(X>Y)
                    System.out.println("DIESEL");
                else if(X<Y)
                    System.out.println("PETROL");
                else
                    System.out.println("SAME PRICE");
                T--;
            }
        }
    }
}
