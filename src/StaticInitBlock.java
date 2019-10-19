public class StaticInitBlock {
    public static void main(String[] args){
        System.out.println("main()");
        Tools.t1.f(4);
    }
    static Tools ts=new Tools();
}

class Tools {
    static Tool t1=new Tool(1);
    static {
        System.out.println("进入初始化块");
        t1=new Tool(11);
        t3=new Tool(22);
        t2=new Tool(33);
        System.out.println("退出");
    }
    static Tool t2=new Tool(2);
    Tools(){
        System.out.println("Tools()");
    }
    static Tool t3 = new Tool(3);
}

class Tool {
    Tool(int i){
        System.out.println("Tool("+i+")");
    }
    void f(int i){
        System.out.println("f("+i+")");
    }
}