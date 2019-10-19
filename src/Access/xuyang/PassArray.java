package Access.xuyang;

public class PassArray {
    public static void main(String[] args){
        int[] arr={10,4,2,8,5,20,16,1};

        System.out.println("排序前:");

        for(int e:arr){
            System.out.println(" "+e);
        }
           System.out.println();
        selectionSort(arr);
        System.out.println("排序后:");
        for(int e:arr){
            System.out.println(" "+e);
        }
    }

    public static void selectionSort(int[] la){
        int temp,k;
        for(int i=0;i<la.length;i++){
            k=i;
            for(int j=i+1;j<la.length;j++){
                if(la[j]<la[k]){
                    k=j;
                }
            }
            temp=la[i];
            la[i]=la[k];
            la[k]=temp;
        }
    }

}
