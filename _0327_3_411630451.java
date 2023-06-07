package Me;
import java.util.Scanner;
public class _0327_3_411630451 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        matrix(n);

    }
    public static void matrix(int n){
    for(int i=n-1; i>=0; i--){
        for(int j=n-1; j>=0;j--){
        int m1= (int)(Math.random()*2);
        if(j!=0){
        System.out.printf("%d ",m1);
        }
        else{
            System.out.printf("%d",m1);
        }
        }
        System.out.println();
    }
}
 }
    
