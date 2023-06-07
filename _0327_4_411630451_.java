package Me;
import java.util.Scanner;
public class _0327_4_411630451_{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int millisec = input.nextInt();
        millisec(millisec);

    }
    public static void millisec(int millisec){
        int sec = millisec/1000%60;
        int min = millisec/60000%60;
        int hour = millisec/3600000;
        System.out.printf("%02d:%02d:%02d\n",hour ,min ,sec);
    }
}
