package Me;
import java.util.Scanner;
public class Final3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        result(num);
    }
    public static int result(int num){
        System.out.println("number  square  cube");
        for(int i =1;i<=num;i++){
            if(i%2==0||i%3==0){
                System.out.printf("%-8d%-8d%d\n",i,i*i,i*i*i);
            }
        }
        return num;
    }

}
