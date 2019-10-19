package TestRunnable;

public class TestDaemon implements Runnable{
    public static void main(String[] args) throws InterruptedException{
        Thread thread = Thread.currentThread();         //返回对当前正在执行的线程对象的引用
        System.out.println("线程"+thread.getName()+"是否守护线程:"+thread.isDaemon());
        Thread damon=new Thread(new TestDaemon());
        System.out.println("在线程"+thread.getName()+"中创建的线程默认是否守护线程"+damon.isDaemon());
        damon.setDaemon(true);                              //转换为启动线程，必须在启动前调用
        damon.start();
        Thread.sleep(2);                    //暂停当前正在执行的线程2ms
    }

    public void run(){
        Thread thread=Thread.currentThread();
        System.out.println("线程"+thread.getName()+"是否是守护进程"+thread.isDaemon());
        Thread daemon=new Thread(new TestDaemon());
        System.out.println("在线程"+thread.getName()+"中创建的线程默认是守护线程："+daemon.isDaemon());


        while (true){
            System.out.println("线程"+thread.getName()+"正在运行");
        }
    }
}
