package y2021.november;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int X = sc.nextInt();
                int Y = sc.nextInt();
                if(X==0 && Y%2==0)
                    System.out.println("YES");
                else if(X==0 && Y%2!=0)
                    System.out.println("NO");
                else if((X + Y*2)%2==0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
                T--;
            }
        }
    }
}
