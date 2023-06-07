package Me;

import java.util.Scanner;


public class Mid4_411630451 {

    public static void main(String[] args) {
        //411630451
        System.out.println("Please input String:");
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        int i = s1.length();
        System.out.println(s1 + " " + i);
        
        char c3 = s1.charAt(0);
        char c2 = s1.charAt (1);
        char c1 = s1.charAt (2);
        char c0 = s1.charAt (3);
        
        int i3 = c3 - '0' ;
        int i2 = c2 - '0' ;
        int i1 = c1 - '0' ;
        int i0 = c0 - '0' ;
        
        int v = (int)(i3 * Math.pow(2, 3) + i2 * Math.pow(2,2) 
                + i1* Math.pow(2,1) + i0* Math.pow(2,0));
        
        System.out.println(v);
        
        char c;
        if(v>=10){
            c = (char) ('A' + (v - 10));
         } else
            c = (char)('0' + v);
        
        System.out.println(c);
    }
}
