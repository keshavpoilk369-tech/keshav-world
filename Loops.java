package Aimaster;
import java.util.Scanner;
public class Loops {
    static void main() {
      Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR AGE : ");
        //u can also use int data type
      float age = sc.nextFloat();

      if(age >= 18.0){
          System.out.println("you are eligible");
      }else{
          System.out.println("you are not eligible");
      }
      sc.close();
    }
}
