package Init;

public class TestInit {
    {
        System.out.println("类TestInit的实力初始化块");
    }

    static {
        System.out.println("类TestInit的静态初始化快");
    }
    public TestInit(){
            new Child();
    }
    public static void main(String[] args){
        new TestInit();
    }
}

class Child extends Father{
    {
        System.out.println("类Child的实例初始化块");
    }

    static {
        System.out.println("类Child的静态初始化块");
    }
    Child(){
        System.out.println("类Child 的构造方法");
    }
}

class Father{
    private int age;
    {
        System.out.println("类Father的实例初始化块");
    }
    static {
        System.out.println("静态初始化快");
    }
    Father(){
        this(20);
        System.out.println("类Father的构造方法Father()");
    }
    Father(int age){
        this.age=age;
        System.out.println("类Father的构造方法Father(int)");
    }

}
