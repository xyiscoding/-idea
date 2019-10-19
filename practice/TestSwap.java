public class TestSwap{
    public static void main(String[] args){
        int i=2,j=5;



        //交换数值之前
        System.out.println("运行swap前交换的数值");
        System.out.println("i="+i+"\t j="+j);


       //run
        swap(i,j);


        //交换数字之后
        System.out.println("运行swap后交换的数值");
        System.out.println("i="+i+"\t j="+j);
    }



    static void swap(int a , int b){
        int temp;

        //内部打印数值以作比较
        System.out.println("swap中交换前的数值");
           System.out.println("a="+a+"\t b="+b);

        temp=a;
        a=b;
        b=temp;


         //内部打印数值以作比较
        System.out.println("swap中交换后的数值");
        System.out.println("a="+a+"\t bj="+b);
    }
}