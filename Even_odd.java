package Aimaster;
import java.util.Scanner;
public class Even_odd {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER : ");
//        int k = sc.nextInt();
        long k = sc.nextLong();

        if(k%2 == 0){
            System.out.println("EVEN NUMBER");
        }else{
            System.out.println("odd number");
        }
        sc.close();
    }

}
