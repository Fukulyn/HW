package Me;
import java.lang.Math;
public class _2midextra {
public static void main(String[] args){
    String num = "411630451";  //輸入學號
    int[] array = new int[num.length()];
    double sum = 0;
    for(int i=0; i<9; i++){
        array[i] = num.charAt(i) - '0';
        sum += array[i];
    }
    double mean = sum / array.length;
    double variance = 0;
    for(int i=0; i<9; i++){
        variance += Math.pow(array[i] - mean, 2);
    }
    System.out.println(variance / array.length);
}
}
