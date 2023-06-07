package Me;
import java.util.Scanner;
import java.lang.Math;
public class _2mid1 {    
public class Mid01{
    public static int tenToDec(String s){
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            sum += (s.charAt(i) - '0') * Math.pow(2, s.length()-i-1);
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        System.out.println(tenToDec(s1));
        System.out.println(tenToDec(s2));
    }
}

}

