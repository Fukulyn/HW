package Me;

public class Mid2_411630451 {
    public static void main(String[] args) {
        //411630451
        int x1=(int)(Math.random()*10);
        int y1=(int)(Math.random()*10);
        int x2=(int)(Math.random()*10);
        int y2=(int)(Math.random()*10);
        int x3=(int)(Math.random()*10);
        int y3=(int)(Math.random()*10);
        
        double s1=Math.pow(((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)),0.5);
        double s2=Math.pow(((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2)),0.5);
        double s3=Math.pow(((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3)),0.5);
        //System.out.println("Three sides length: "+s1+" "+s2+" "+s3);
        System.out.printf("Three sides length: %1.2f %1.2f %1.2f \n",s1,s2,s3);
        
        
        double s=(s1+s2+s3)/2;
        System.out.printf("s:%1.2f \n",s);
        System.out.printf("area:%2.2f ",Math.pow((s*(s-s1)*(s-s2)*(s-s3)), 0.5));
    }
    
}
