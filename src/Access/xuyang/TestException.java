package Access.xuyang;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) throws Ex{
        int num1=0,num2=0;
        boolean inputError1=true,inputError2=true;
        Scanner scanner = new Scanner(System.in);
        do{
            try{
                System.out.println("请输入一个整数被除数");
                num1=scanner.nextInt();
                inputError1=false;
            }catch (InputMismatchException ex){
                System.out.println("输入错误，必须输入整数，请重输");
            }
        }while (inputError1);

        do{
            try{
                System.out.println("请输入一个整数被除数:");
                num2=scanner.nextInt();
                int num3=divide(num1,num2);
                inputError2=false;
                System.out.println(num1+"/"+num2+"="+num3);
            }catch (InputMismatchException ex){
                System.out.println("输入错误，必须输入一个整数，请重输");
                scanner.nextLine();
            }catch(ArithmeticException ex){
                System.out.println("输入错误，除数不能是0，请重输");
            }
        } while(inputError2);
        //method();


    }

    static int divide(int num1,int num2)throws ArithmeticException{
        return num1/num2;
    }

    static void method() throws Ex{
        throw new Ex();
    }


}

class Ex extends Exception{}