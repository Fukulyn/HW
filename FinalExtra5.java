package Me;
import java.util.Scanner;

public class FinalExtra5{
    public static void result(int n){
        for(int i=0; i<n/2; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=n-(2+2*i); k>0; k--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int l=0; l<i; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int z=0; z<n; z++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=0; i<n/2; i++){
            for(int j=n/2; j>i+1; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=0; k<2*i+1; k++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int l=n/2; l>i+1; l--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        result(n);
    }
}