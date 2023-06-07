package Me;

import java.util.Scanner;


public class Mid3_411630451 {
    public static void main(String[] args) {
        //411630451
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 3 package weight:");
        double w1 = input.nextDouble();
        double w2 = input.nextDouble();
        double w3 = input.nextDouble();
        
        System.out.printf("%-10s%-10s\n","weight","cost");
       
        if(0 < w1 && w1 <=5){
            System.out.printf("%-10.1f%-10s\n", w1, "4.5");
        }
        else if(5 < w1 && w1 <=10){
            System.out.printf("%-10.1f%-10s\n", w1, "7.5");
        }
        else if(w1 >10){
            double cost = 7.5+(w1-7.5)*0.5;
            System.out.printf("%-10.1f%-10.1f\n", w1, cost);
        }
        if(0 < w2 && w2 <=5){
            System.out.printf("%-10.1f%-10s\n", w2, "4.5");
        }
        else if(5 < w2 && w2 <=10){
            System.out.printf("%-10.1f%-10s\n", w2, "7.5");
        }
        else if(w2 >10){
            double cost = 7.5+(w2-7.5)*0.5;
            System.out.printf("%-10.1f%-10.1f\n", w2, cost);
        }
        if(0 < w3 && w3 <=5){
            System.out.printf("%-10.1f%-10s\n", w3, "4.5");
        }
        else if(5 < w3 && w3 <=10){
            System.out.printf("%-10.1f%-10s\n", w3, "7.5");
        }
        else if(w3 >10){
            double cost = 7.5+(w3-7.5)*0.5;
            System.out.printf("%-10.1f%-10.1f\n", w3, cost);
        }
        
        
    }
    
}


