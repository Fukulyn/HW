package Me;
import java.lang.Math;
public class _2mid3 {
    public static void main(String[] args){
        int[] a = new int[15];
        for(int i=0; i<15; i++){
            a[i] = (int)(Math.random()*10);
            if((i+1)%5 == 0)
                System.out.println(a[i]);
            else
                System.out.print(a[i] + " ");
        }
        int n = 0;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                if(i == j)
                    System.out.println(a[n]);
                else
                    System.out.print(a[n] + " ");
                n++;
            }
        }
    }
}

