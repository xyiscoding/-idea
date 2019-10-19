package Access.CatchAllException;

public class CatchAllExceptioon {
    public static void main(String[] args){
        for(int index=0;index<=1;index++){
            try{
                System.out.println("调用method("+index+")");
                method(index);
                System.out.println("调用divide(1."+index+")");
                divide(1,index);
            }catch (Exception ex){
                System.out.println("抛出了异常"+ex.toString());
            }
        }
    }

    static void method(int i)throws Ex{
        if(i==1){
            throw new Ex();
        }
    }

    static int divide(int num1,int num2){
        return num1/num2;
    }

}
class Ex extends Exception{}