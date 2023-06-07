package Me;
import java.util.Scanner;  
    import java.lang.Math; 
public class _0223_3_411630451 { 
        public static void main(String[] args) {   
            Scanner input = new Scanner(System.in);  
            int startRight = 0;  
            int endSpace = 7;  
            int n = input.nextInt();  
            for (int row = 1; row <= Math.pow(3 ,n); row *= 3) {  
                for (int startSpace = 0; startSpace < endSpace; startSpace++) {  
                    System.out.print("     ");  
                }  
                for (int l = 1; l <= row; l *= 3) {  
                    System.out.printf("%5d", l);  
                }  
                for (int r = startRight; r > 0 ; r /= 3 ) {  
                    System.out.printf("%5d", r);      
                }  
                System.out.println();  
                endSpace--;  
                startRight = row;  
            }  
        }  
    }  

