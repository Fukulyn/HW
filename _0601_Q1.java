package Me;

public class _0601_Q1 {
    public static void main(String args[]){
        int[] x = {5, 7, 4, 6, 3};
        inSort(x);
        for(int result:x){
            System.out.printf("%d ",result);
        }
    }
    public static int[] inSort(int[] x){
        for(int i=1; i<=x.length-1; i++){
            int tmp = x[i];
            int j = i-1;
            while(j>=0 && x[j]>tmp){
                x[j+1]=x[j];
                j--;
            }
            x[j+1]=tmp;
        }
    return x; 
    }
}
