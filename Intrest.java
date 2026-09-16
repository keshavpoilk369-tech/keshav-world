package Aimaster;
import java.util.Scanner;

public class Intrest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income : ");
        double income = sc.nextDouble();
        double tax = 0;

        //-->> if income is less than 2.5l

        if(income <= 250000){
            tax = 0;
        }else if(income <= 500000){
            tax += (income-250000)*0.05;//--->>12500 tax
        }else if(income <= 100000){
            tax += 12500+(income-500000)*0.20; //-->> 12500 first tax add hoga
        }else{
            tax += 112500+(income-100000)*0.30; //-->> 112500 dono ka tax add hoga
        }
        System.out.println("Your final tax on your income: "+tax+" Rs-");
        System.out.println("Your final income after tax deduction : "+ (income-tax)+" Rs-");
    }
}
