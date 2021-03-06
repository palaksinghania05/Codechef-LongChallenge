package y2021.july;

import java.util.Scanner;

//Maximum Production
/*Chefland has 7 days in a week. Chef is very conscious about his work done during the week.
There are two ways he can spend his energy during the week. The first way is to do x units of work every day
 and the second way is to do y (>x) units of work for the first d (<7) days and to do z (<x) units of work
 thereafter since he will get tired of working more in the initial few days.
 Find the maximum amount of work he can do during the week if he is free to choose either of the two strategies.
*/
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int d = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                int way1 = x*7;
                int way2 = (y*d) + ((7-d)*z);
                System.out.println(Math.max(way1,way2));
                T--;
            }
        }
    }
}
