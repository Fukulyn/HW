package Me;
import java.util.Scanner;
public class Final2 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int number = input.nextInt();
        int max = number;
        int count = 0;
        while(number!=0){
            number = input.nextInt();
            if(number > max){
                max = number;
                count = 0;
            }
            if(number == max){
                count++;
            }
        }
        System.out.printf("max=%d (%d times)\n",max,count);
    }
}
