package Me;

import java.util.Scanner;
public class _0511_1_411630451 {

    public static int[] reverse(int[] list){
        int[] result = new int[list.length];

        for(int i=0,j=result.length-1;
            i < list.length; i++, j--){
                result[j]=list[i];
        }
        return result;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int arraylen = s.nextInt();
        int[] element = new int[arraylen];
        for (int i = 0; i < arraylen; i++) {
            element[i] = s.nextInt();
        }
        System.out.println("before");
        for (int i = 0; i < arraylen; i++){
            if(i<arraylen-1){
                System.out.printf("%d ",element[i]);
            }
            else{
                System.out.printf("%d",element[i]);
            }
        }
        System.out.println();
        System.out.println("after");
        int[] result = reverse(element);
        for (int i = 0; i < result.length; i++){
            if(i<result.length-1){
                System.out.printf("%d ",result[i]);
            }
            else{
                System.out.printf("%d\n",result[i]);
            }
        }
    }
}

