import java.util.Scanner;



public class HanoiTower{
    public static void main(String[] args){

        int num;
        Scanner scanner=new Scanner(System.in);

        System.out.println("请输入个数:");
        num=scanner.nextInt();
        hanoi('A', 'C', 'B', num);
        scanner.close();
    }

static void hanoi(char from,char to ,char temp,int n){
    if(n==1){
        System.out.println(from+"move to"+to);
    }
    else {
        hanoi(from,temp,to,n-1);
        
        System.out.println(from+"move to"+to);
        hanoi(temp, to, from, n-1);
    }
}

}