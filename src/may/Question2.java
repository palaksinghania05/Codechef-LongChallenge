//GOLF Problem

package may;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int T = sc.nextInt();
            while(T>0){
                int N = sc.nextInt();
                int x = sc.nextInt();
                int k = sc.nextInt();
                ArrayList<Integer> forward = new ArrayList<>();
                ArrayList<Integer> backward = new ArrayList<>();
                for (int i = 0; i < N; i++) {
                     forward.add(i*k);
                }
                System.out.println(forward);
                for (int i = (N+2); i >= 0; i--) {
                     backward.add(i*k);
                }
                System.out.println(backward);
                if(forward.contains(x) || backward.contains(x))
                    System.out.println("YES");
                else
                    System.out.println("NO");
                T--;
            }
        }*/
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int T = sc.nextInt();
            while(T>0) {
                int N = sc.nextInt();
                int x = sc.nextInt();
                int k = sc.nextInt();
                if(x%k == 0 || (N+1-x)%k == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
                T--;
            }
        }
    }
}
