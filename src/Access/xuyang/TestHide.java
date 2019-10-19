package Access.xuyang;

import Init.TestInit;

public class TestHide extends ParentClass{
    private int num=100;
    public static void main(String[] args){
        fun();
        new TestHide().print();
    }
    public static void fun(){
        System.out.println("fun() in TestHide");
    }
    public void print(){
        super.fun();
        ParentClass.fun();
        System.out.println("super.num"+super.num+"\tnum"+num);

    }
}

class ParentClass{
    protected int num = 50;
    public static void fun(){
        System.out.println("fun() in ParentClass");
    }
}