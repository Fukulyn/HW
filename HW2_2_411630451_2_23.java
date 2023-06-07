package Me;

import java.util.Scanner; 

public class HW2_2_411630451_2_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double dis = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double miles = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double price = input.nextDouble();
        
        double cost = (dis / miles) * price;
        System.out.println("The cost of driving is " + (int)(cost * 100) / 100.0);
    }
}
