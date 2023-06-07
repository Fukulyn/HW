package Me;
import java.util.Scanner;
public class _0223_2_411630451 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        result(num);
    
    }
    public static int result(int num){
        int i = 2;
        while(num>1){
            while(num%i==0){
                System.out.printf("%d",i);
                num = num / i;
                if(num == 1)break;
                    else{
                     System.out.print(" ");
                }
                            
            }
            i++;
        }
        System.out.println();
        return i;
    }
}
