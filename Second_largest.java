package Aimaster;
import java.util.Scanner;
public class Second_largest {
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //-->>print a second
        if ((a >= b && a <= c) || (a >= c && a <= b)){
            System.out.println("a is second largest");
        }else if((b >= a && b <= c)||(b >= c && b <= a)){
            System.out.println("b is second largest");
        }else{
            System.out.println("c is second largest");
        }


    }
}
