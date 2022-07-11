//TRAVEL PASS

package y2021.september;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int N = sc.nextInt();
                int A = sc.nextInt();
                int B = sc.nextInt();
                String travel = sc.next();
                char[] arr = travel.toCharArray();
                int time = 0;
                for (int i = 0; i < N; i++) {
                    if(arr[i]=='0') {
                        time += A;
                    }
                    else
                        time += B;
                }
                System.out.println(time);
                T--;
            }
        }
    }
}
