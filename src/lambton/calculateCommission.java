package lambton;

import lambton.salesPerson.CommissionRate;

import java.util.Scanner;


public class calculateCommission {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the sales person's monthly sales:");
        double sales = myObj.nextDouble();
        System.out.println("Enter the amount of advance pay:");
        double advance= myObj.nextDouble();
        CommissionRate cR = new CommissionRate(sales,advance);
        cR.display();

    }
}
