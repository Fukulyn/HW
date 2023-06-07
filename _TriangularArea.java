package Me;

import java.util.Scanner;

public class _TriangularArea { 
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         double length =  input.nextDouble();
         
         double area  = (double)(Math.pow(length, 2)*
                     (Math.sqrt(3))/ 4*100.00 ) / 100.00;
         double volume = area * length ;
         
         System.out.printf("The area is %.2f\n" , area);
         System.out.printf("The volume of the Triangular prism is %.2f\n" , volume);
     }
}

