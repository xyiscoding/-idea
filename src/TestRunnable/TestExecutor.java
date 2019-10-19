package TestRunnable;

import Init.TestInit;

import java.lang.reflect.Executable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutor implements Runnable{
    String str;
    int num;
    public TestExecutor(String str,int num){
        this.str=str;
        this.num=num;
    }

    public static void main(String[] args){
        ExecutorService exec= Executors.newFixedThreadPool(2);
        for(int index=0;index<10;index++){
            exec.execute(new TestExecutor("Thread"+index,2));
        }
        exec.shutdown();
    }


    public void run(){
        for(int index=0;index<num;index++){
            System.out.println(str);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}
