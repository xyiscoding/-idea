package Access;

public class Cat extends Animal{
    public static void main(String[] args){
        Cat cat5=new Cat();
        cat5.setAge(2);
        cat5.setWeight(5);
        System.out.println("CAT");
        cat5.meow();
        System.out.println("Age="+ cat5.getAge()+"\t\tWeight="+ cat5.getWeight());
    }
    void meow(){
        System.out.println("Meow..");
    }
}


class Animal {
    private int weight;
    private int age;

    int getAge(){
        return age;
    }

    int getWeight(){
        return weight;
    }

    void setAge(int age){
        this.age=((age>=0)?age:0);
    }

    void setWeight(int weight){
        this.weight=((weight>=0)?weight:0);
    }
}