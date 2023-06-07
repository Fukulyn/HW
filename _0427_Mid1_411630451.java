package Me;
import java.util.Scanner;
public class _0427_Mid1_411630451 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = "0";
    for(int n = 0;n < 2;n++){
        a = sc.next();
    }
    System.out.println(bintoDec(a));
}
public static int bintoDec(String s){
    int total = 0;
    int k = 0;
    int o = s.length();

    for(int n = 0; n < s.length();n++){
        if(s.codePointAt(n) == 49){
            System.out.println(o);
            total = (int)(total + Math.pow(2,o));

        }
        o--;
    }
    return total;


}
}
