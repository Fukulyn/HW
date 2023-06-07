package Me;

import java.util.Scanner;


public class JavaApplication1 { 
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter your number (1~7) ");
      int number = input.nextInt();
      if(number > 7)
              {
     System.out.print("Input error. Please try again.");
              }
      else if(number < 1) 
      {
      System.out.print("Input error. Please try again.");
      }
     else if(number == 1) 
          {
      System.out.print("Number 1 is Monday.");
      }
      else if(number == 2) 
          {
      System.out.print("Number 2 is Tuesday.");
      }
      else if(number == 3) 
          {
      System.out.print("Number 3 is Wednesday.");
      }
      else if(number == 4) 
          {
      System.out.print("Number 4 is Thrusday.");
      }
      else if(number == 5) 
          {
      System.out.print("Number 5 is Friday.");
      }
      else if(number == 6) 
          {
      System.out.print("Number 6 is Saturday.");
      }
      else if(number == 7) 
          {
      System.out.print("Number 7 is Sunday.");
      }
      
         
         
         
         
         
         
         
         
         
     }
}