public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat(5, 10);
        System.out.println("CAT age:"+cat.age+"\t weight:"+cat.weight);
    }
}
class Cat{
    int age;
    int weight;
    Cat(int itsAge,int itsWeight){
        age=itsAge;
        weight=itsWeight;

    }
}
