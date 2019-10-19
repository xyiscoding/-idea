import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入");
        n=scanner.nextInt();
        System.out.println("第"+n+"项是"+fib(n));
        scanner.close();
    }

    static long fib(int n){
        if(n<=2){
            return 1;
        } else{
            return(fib(n-1)+fib(n-2));
        }
    }
}