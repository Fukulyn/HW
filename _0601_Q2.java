package Me;

public class _0601_Q2 {
    public static void main(String args[]){
        int[] a = {1,3,1,6,0,9,6};
        int[] b = del(a,1);
        int[] c = del(a,6);
        int[] d = del(a,2);

        for(int result:b){
            System.out.printf("%d ",result);
        }
        System.out.println();

        for(int result:c){
            System.out.printf("%d ",result);
        }
        System.out.println();

        for(int result:d){
            System.out.printf("%d ",result);
        }       
        System.out.println();

        
    }
    public static int[] del(int[] a, int item){
        int size = 0;
        for(int i=0; i<=a.length-1; i++){
            if(a[i]!=item){
                size++;
            }
        }
        int[] result = new int[size];
        int j = 0;
        for(int i=0; i<=a.length-1; i++){
            if(a[i]!=item){
                result[j]=a[i];
                j++;
            }
        }
        return result;
    }
}
