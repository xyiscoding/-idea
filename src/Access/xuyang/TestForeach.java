package Access.xuyang;

public class TestForeach {
    public static void main(String[] args){
        int total=0;
        int[] arr={1,2,3,4};

        System.out.print("arr");

        for(int e:arr){
            System.out.print(" "+e);
            total+=e;
        }
        System.out.println("\nTotal="+total);
    }
}
