package xuyang.com.people;

public class Professor extends Teacher{
    public Professor(){
        System.out.println("调用Professor的构造方法");
    }
    public static void main(String[] args){
        Professor professor = new Professor();
    }
}

class Teacher extends People{
    public Teacher(){
        System.out.println("调用Teacher的构造方法");
    }
}

class People{
    public People(){
        System.out.println("调用People的构造方法");
    }
}