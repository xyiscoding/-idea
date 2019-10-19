package Access.xuyang;
import ch05.Animal;
public class Dogs extends Animal{
    public static void main(String[] args){
        Dogs dog=new Dogs();
        dog.setAge(10);
        dog.setWeight(20);
        dog.getAge();

        dog.getWeight();

        dog.walk();
        System.out.println("Age:"+dog.getAge()+"weight"+dog.getWeight());
    }
}

class TestProtected{
    public static void main(String[] args){
        Dogs dog = new Dogs();
        dog.walk();
        Dogs.main(args);

    }
}