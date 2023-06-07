package Me;
import java.util.Scanner;
public class _2mid2 {
    public static long f(int n){
        int sum = 1;
        for(int i=1; i<=n; i++){
            sum *= i;
        }
        return sum;
    }
    public static double h(int num){
        double sum = 1;
        for(int i=1; i<=num; i++){
            sum += 1.0/f(i);
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1; i<=n; i++){
            System.out.printf("%-4d%-4.4f\n",i, h(i));
        }
    }
}

