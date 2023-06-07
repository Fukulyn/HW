package Me;

import java.util.Scanner;
public class _0504_4_411630451 {

    public static int getNotInRandom(int number1, int number2){
        int randomValue;
        do {
            randomValue = (int)(Math.random() * 5) + 1;
        } while (randomValue == number1 || randomValue == number2);
        return randomValue;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num_1 = input.nextInt();
        int num_2 = input.nextInt();
        int random2 = getNotInRandom(num_1,num_2);
        System.out.println(random2);
    }
}
