package Me;
import java.util.Scanner;
import java.lang.Math;
public class _0223_4_411630451{
	public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
		int startRight = 0;
		int endSpace = 7;
        int n = input.nextInt();
		for (int row = 1; row <= Math.pow(3 ,n); row = row * 3) {
                            //row = 1; row <= 27; row *= 3;
                            //row =3 ; row <=27; row *=3;
                            //row = 9; row <=27; row *= 3;
                            //row = 27;
			for (int startSpace = 0; startSpace < endSpace; startSpace++) {
				System.out.print("     ");
			}
			for (int l = 1; l <= row; l *= 3) {
				System.out.printf("%5d", l);
			}
			for (int r = startRight; r > 0 ; r /= 3 ) {
				System.out.printf("%5d", r);	
			}
			System.out.println();
			endSpace--;
			startRight = row;
		}
	}
}


