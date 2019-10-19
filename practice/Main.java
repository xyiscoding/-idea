public class Main {
    public static void main(String[] args) {
        Cat3 cat=new Cat3();
        System.out.println("CAT age:"+cat.age+"\t weight:"+cat.weight);

        Cat3 cat1=new Cat3(5, 10);
        System.out.println("Cat3 age"+cat1.age+"\t"+cat1.weight);
    }
}
class Cat3{
    int age;
    int weight;
    Cat3(){
        age=2;
        weight=4;
        System.out.println("int Cat3()");
    }
    Cat3(int itsAge,int itsWeight){
        age=itsAge;
        weight=itsWeight;
    System.out.println("in Cat(int itsAge,int itsWeight)");
    }
}