package Me;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        if (i>9||i<1){
            System.out.println("input error");
        }
        else{
            for(int k=1; k<=9; k++){
                System.out.print("|");
                 for(int j=i; j<=9; j++){
                 System.out.printf("%d*%d=%2d|",j,k,j*k);
            }
                 System.out.println();
            }
        }
        
    }
}
