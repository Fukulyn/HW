package Me;
import java.util.Scanner;
public class _0323_411630451 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] score = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
           score[i] = input.nextInt();
            sum += score[i];
          }
          double avg = sum/5.0;
          int count = 0; 
        for (int i = 0; i < 5; i++) 
          if (score[i] > avg)
            count++;
    
    System.out.printf("sum=%d avg=%.1f count=%d\n" ,sum ,avg ,count);
    }
}
