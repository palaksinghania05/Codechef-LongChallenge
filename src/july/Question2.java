package july;//Relativity
/*
In Chefland, the speed of light is c m/s, and acceleration due to gravity is g m/s2.
Find the smallest height (in meters) from which Chef should jump such that during his journey down only
under the effect of gravity and independent of any air resistance, he achieves the speed of light and
verifies Einstein's theory of special relativity.
Assume he jumps at zero velocity and at any time, his velocity (v) and depth of descent (H) are related as
v2=2⋅g⋅H.
 */


import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T-->0){
                int g = sc.nextInt();
                int c = sc.nextInt();
                int result = (c*c)/(2*g);
                System.out.println(result);
            }
        }
    }
}
