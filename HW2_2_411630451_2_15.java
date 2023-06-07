package Me;

import java.util.Scanner;

public class HW2_2_411630451_2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double xone = input.nextDouble();
        double yone = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double xtwo = input.nextDouble();
        double ytwo = input.nextDouble();
        
        double xtri = (xtwo - xone);
        double ytri = (ytwo - yone);
        double x = Math.pow(xtri,2);
        double y = Math.pow(ytri,2);
        double sum = Math.pow(x + y,0.5);
        
        System.out.println("The distance between the two points is " + sum);
        
        
    }
    
}
