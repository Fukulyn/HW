package Me;

import java.util.Scanner;
public class _0518_Q_411630451{
    
    public static int[] smallestList(int[] arr){ // �n���D�حn�D
        int min = 99;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for(int j = 0; j<arr.length; j++){
            if(arr[j]==min){
                System.out.printf("%d ",j); // �n�m�߫ظm�^�ǰ}�C
            }
        }
        return arr;
}
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] d = new int[n];
        for(int i = 0; i<d.length; i++){
            d[i]= s.nextInt();
        }
        int[] res = smallestList(d); // �[�C�L
    }
}
