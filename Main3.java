package Me;
import java.util.Scanner;
public class Main3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        for(int p = 1;p<=i;p++){
            for(int k = 1;k<=i - p;k++){
                System.out.print(" ");
            }
           for(int j  = 1;j<=p;j++){
              System.out.print("*");
        }
        System.out.println();
    }
  }
}
