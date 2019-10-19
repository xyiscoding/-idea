package Access.xuyang;

public class InitArray {
    public static void main(String[] args){
        int[] b={1,2,3};
        double[] d = new double[] {1.2,3.4};
        Integer[] intArr1={new Integer(1),new Integer(2)};
        Integer[] intArr2;
        intArr2=new Integer[]{new Integer(2),new Integer(4),new Integer(6)};

        for(int i=0;i<b.length;i++){
            System.out.println("b["+i+"]="+b[i]);
        }
        System.out.println();

        for(int i=0;i<d.length;i++){
            System.out.println("d["+i+"]="+d[i]);
        }
        System.out.println();

        for(int i=0;i<intArr1.length;i++){
            System.out.println("intArr1["+i+"]="+intArr1[i]);
        }
        System.out.println();

        for(int i=0;i<intArr2.length;i++){
            System.out.println("intArr2["+i+"]="+intArr2[i]);
        }
        System.out.println();

    }
}
