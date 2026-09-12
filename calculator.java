package Aimaster;
import java.util.Scanner;
public class calculator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE FIRST NUMBER : ");
        int a = sc.nextInt();
        System.out.print("ENTER THE SECOND NUMBER : ");
        float b = sc.nextFloat();
        int oprators = sc.nextInt();

        switch (oprators){
            case 1 :
                System.out.println(a+b);
            break;
            case 2 :
                System.out.println(a-b);
            break;
            case 3 :
                System.out.println(a*b);
            break;
            case 4 : if(b == 0){
                System.out.println("INFINITY");
            }else{
                System.out.println(a/b);
            }
            break;
            case 5 : if(b == 0){
                System.out.println("INVALID");
            }else{
                System.out.println(a%b);
            }
            break;
            default:
                System.out.println("INVALID OPRATORS");

                /*
                if you do not use break then print every thing after the case
                 */
        }

    }
}
