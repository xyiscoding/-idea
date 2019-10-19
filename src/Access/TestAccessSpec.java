package Access;

public class TestAccessSpec {
    public static void main(String[] args){
        Cat4 cat4 = new Cat4(1,1);
        System.out.println("Cat's Age"+cat4.age+"Cat's weight"+cat4.getWeight());
        cat4.setAge(2);
        cat4.setWeight(5);
        System.out.println("Cat's weight:"+cat4.getAge()+"Cat's weight"+cat4.getWeight());
    }
}
class Cat4{
     int age;
    private int weight;

    Cat4(int a,int w){
        age=a;
        weight=w;
    }

    int getAge(){
        return age;
    }

    int getWeight(){
        return weight;
    }

    void setAge(int a){
        age=a;
    }

    void setWeight(int w){
        weight=w;
    }
}