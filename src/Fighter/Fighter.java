package Fighter;

public class Fighter extends Warplane{
    public Fighter(){
       // super();
        System.out.println("调用构造方法Fighter");
    }
    public Fighter(int speed){
        super(speed);
        System.out.println("调用构造方法Fighter(int speed)");
    }
    public static void main(String[] args){
        System.out.println("创建对象Fighter");
        Fighter fighter=new Fighter();
        System.out.println("创建对象Fighter fighter2");
        Fighter fighter1= new Fighter(500);
    }
}

class Warplane extends Airplane{
    public Warplane(){
        super(600);
        System.out.println("调用构造方法Warplane");
    }
    public Warplane(int speed){
        super(speed);
        System.out.println("调用Warplane(speed)");
    }
}

class Airplane{
    private int speed;
    public Airplane(int speed){
        this.speed=speed;
        System.out.println("调用构造方法Airplane(speed)");
    }
}