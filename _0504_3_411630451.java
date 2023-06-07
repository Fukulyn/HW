package Me;
import java.util.Scanner;

public class _0504_3_411630451 {
    public static int getInRandom(int number1, int number2){
        if (number1 == number2) {
            return number1;
        }
        double randomValue = Math.random();
        return randomValue < 0.5 ? number1 : number2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num_1 = input.nextInt();
        int num_2 = input.nextInt();
        int random1 = getInRandom(num_1, num_2);
        System.out.println(random1);
    }
}

