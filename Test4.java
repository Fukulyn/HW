package Me;
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input three sides of Triangle:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int s = (a + b + c) / 2;
        
        int max = Math.max(a,(Math.max(b ,c)));
        int min = Math.min(a, Math.min(b, c));
        
        System.out.println(String.format("Max(%d, %d, %d)=%d", a,b,c, max));
        System.out.println(String.format("Min(%d, %d, %d)=%d", a,b,c, min));
        System.out.println(String.format("Three sides of triangle are %d, %d, %d", a,b,c));
        System.out.println(String.format("Perimeter of triangle is %d", a+b+c));
        System.out.println(String.format("Area of triangle is %.5f", Math.sqrt(s*(s - a)*(s - b)*(s - c))));
    }
    
}
