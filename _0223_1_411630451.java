package Me;
import java.util.Scanner;
public class _0223_1_411630451 {  
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.printf("%d\n",result(a, b));
    }
    public static int result(int a,int b){
        int n = 2;
        int count = 0;
        while(a>n && b>n){
            if(a%n==0 && b%n==0){
                count = n;
            }
            n++;
        }
      return count;
    }
}
