package Me;

public class Main2 {
    public static void main(String args[]){
        int i = 1;
        for(int k=1; k<=9; k++){
                System.out.print("|");
                 for(int j=i; j<=9; j++){
                 System.out.printf("%d*%d=%2d|",j,k,j*k);
            }
                 System.out.println();
    }
}
}
