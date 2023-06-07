package Me;
import java.util.Scanner;

public class _0525_Q1 {

    public static void main(String[] args) {

        int count = 0;
        int n = 1000;
        while (count < 30) {
            if (isPalindrome(n)) {
                count++;
                if (count % 10 != 0) {
                    System.out.print(n + "\t");
                } else {
                    System.out.print(n + "\n");
                }
            }
            n++;
        }
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            int remainder = number % 10;
            result = result * 10 + remainder;
            number = number / 10;
        }

        return result;
    }
}
