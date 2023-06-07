package Me;

import java.util.Scanner;
public class _0504_1_411630451{
    public static boolean isSorted(int[] list){
        boolean increasing = true;
        boolean decreasing = true;
        for (int i=1; i <list.length; i++){
            if(list[i] > list[i-1])
                decreasing = false;
            else if(list[i] < list[i-1])
                increasing = false;
        }
        return increasing || decreasing;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] values = new int[length];
        for(int i=0; i<length; i++)
            values[i] = input.nextInt();
        if (isSorted(values))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

