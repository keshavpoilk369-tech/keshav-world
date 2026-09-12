package Aimaster;
import java.util.Scanner;
public class Question1 {
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        if(button == 1){
            System.out.println("hello");
        }else if(button == 2){
            System.out.println("nameste");
        }else if(button == 3){
            System.out.println("bozingo");
        }else{
            System.out.println("Invalid oprators");
        }
        sc.close();
    }
}
