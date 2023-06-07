package Me;
//2.2
import java.util.Scanner;
 
public class HW2_2_411630451_2_2 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Input length of sides and height of the Triangular prism: ");
         double length =  input.nextDouble();
         double height = input.nextDouble();
         
         double area  = (int)(Math.pow(length, 2) *
                    (Math.sqrt(3)) / 4*100.0) / 100.0;
         double volume = area * height;
         
         System.out.println("The area is: " + area);
         System.out.println("The volume of Triangular prism is; " + volume);
     }
}