package TestRunnable;

public class TestRunnable implements Runnable{

    String str;
    int num;
    public TestRunnable(String str,int num){
        this.str=str;
        this.num=num;
    }

    public static void main(String[] args){
        TestRunnable threadA=new TestRunnable("ThreadA",30);
        TestRunnable threadB=new TestRunnable("ThreadB",20);
        new Thread(threadA).start();    //创建并启动新线程
          System.out.println("线程A已经开始运行");
        new Thread(threadB).start();        //创建并启动新线程
        System.out.println("线程B已经开始运行");
    }

    public void run(){                      //子任务
        for(int index=0;index<num;index++){
            System.out.print(str);
        }
    }

}
