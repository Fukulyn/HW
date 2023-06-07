package Me;
import java.util.Scanner;
public class _DigitSum {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int a = i/100;
        int b = (i - a*100)/10;
        int c = (i - a*100)%10;
        System.out.println("The sum of the digits is " + (a + b + c));
    }
    
}
