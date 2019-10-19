package File;
import java.io.*;
public class CopyFile {

        public static void main(String[] args){
            FileInputStream inFile=null;
            FileOutputStream outFile=null;

            if(args.length!=2){
                System.out.println("命令行应为:java copyFile fromFile to File");
                System.exit(0);
            }

            try{
                File fromFile = new File(args[0]);
                if(!fromFile.isFile()){
                    System.out.println("源文件"+args[0]+"不存在！");
                    System.exit(0);
                }

                File toFile=new File(args[1]);
                if(toFile.exists()){
                    System.out.println("目标文件或同名目录"+args[1]+"已存在！");
                    System.exit(0);
                }

                inFile=new FileInputStream(fromFile);
                outFile=new FileOutputStream(toFile);
                System.out.println("文件"+args[0]+"有"+inFile.available()+"个字节");
                int ch;
                while ((ch=inFile.read())!=-1){
                    outFile.write(ch);
                }
            }catch (IOException e){
                System.out.println(e);
            }finally {
                try {
                    if(inFile!=null){
                        inFile.close();
                    }
                    if(outFile!=null){
                        outFile.close();
                    }
                } catch (IOException e){
                    System.out.println(e);
                }

        }
            System.out.println("复制已经完成");
    }
}
