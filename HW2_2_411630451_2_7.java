package Me;

import java.util.Scanner;

public class HW2_2_411630451_2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number of minutes: ");
        int minutes = input.nextInt();
        int years = minutes / 525600;
        int days = (minutes  % 525600) / 1440;
         System.out.println(minutes + " minutes is approximately " + years  + " years "
    + days + " Days ");
    }
}
