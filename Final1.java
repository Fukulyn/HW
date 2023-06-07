package Me;

public class Final1 {
     public static double sum(int n) {
        int t = 1;
        double sum = 1;
        if(n<7&&n>2){
           while(t <= n){
           double a = 1.0/(2*t+1);
           sum = sum + a;
           t++;
           }
        }
        return sum;
}
    public static void main(String[] args) {
        int n = (int)(3 + Math.random() * 4);
        System.out.printf("n=%d sum=%.3f\n",n,sum(n));
    }
       
}

        
    
        

