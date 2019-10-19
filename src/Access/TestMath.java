package Access;
import java.lang.Math.*;
public class TestMath {
    public static void main(String[] args){
        int sum=0;
        for(int i=0;i<10;i++){
            int n=(int)(Math.random()*100);
            System.out.println(n);
            if(i!=9){
                System.out.println("+");
            }
            else{
                System.out.println("=");
            }
            sum+=n;
        }
        System.out.println(sum);

        System.out.println("Math.sin(Math.toRadians(90))="+Math.sin(Math.toRadians(90)));
    }

}
