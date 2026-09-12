package Aimaster;
import java.util.Scanner;
public class loop {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//      for(int i = 1; i <= 9; i++ ){
//            System.out.println("HELLO WORLD");
//        }
 //--------------------------------------------------------------------------------------
        /*
        print n number by using loops
         */
//        int n = sc.nextInt();
//        for(int i = 1; i <= n; i++){
//            System.out.println(i);
//        }
        //----------------------------------------------------------------------------------
//        int k = 1;
//        while(k <= n){
//            System.out.println(k);
//            k++;
   //     }
  //------------------------------------------------------------------------------------
//        int j = 1;
//        do{
//            System.out.println(j);
//            j++;
//        }while(j <= n);

 //-------------------------------------------------------------------------------------------

        /*
        printing sum of n numbers by using loops
         */
//        int sum = 0;
//        for(int i = 1; i <= n; i++){
//            sum += i;
//        }
//        System.out.println(sum);

//---------------------------------------------------------------------------------------


//        int k = 1;
//        int sum = 0;
//        while (k <= n){
//            sum += k;
//            k++;
//        }
//        System.out.println(sum);

//----------------------------------------------------------------------------------------

        int s = 1;
        int sum = 0;
        do{
          sum += s;
          s++;
        }while (s <= n);
        System.out.println(sum);



    }
}
