package Me;
import java.util.Scanner;  

public class HW2_2_411630451_2_6
{
        public static void main(String args[]){  
       int number, a, b, c = 0;  
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number between 0 and 1000: ");
            number = input.nextInt();
            
            a = number /100;
            b = (number - a*100) / 10;
            c = (number- a*100) %10;
            
            System.out.println("Sum of Digits: "+ (a + b + c));  
        }
}