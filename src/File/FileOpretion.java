package File;
import java.io.File;
import java.util.Scanner;


public class FileOpretion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("创建一个目录，请输入目录名：");
        String dirname=scanner.nextLine();
        File dir=new File(dirname);
        if(dir.exists()){
            System.out.println("该目录或同名文件已经存在");
            System.exit(0);
        }
        dir.mkdirs();

        System.out.println("给一个文件(或目录)重命名，请输入旧名");
        String filename = scanner.nextLine();
        File old=new File(filename);
        if(!old.exists()){
            System.out.println("不存在！");
            System.exit(0);
        }
        System.out.println("请输入新名");

        filename=scanner.nextLine();
        File newname=new File(filename);
        if(newname.exists()){
            System.out.println("已存在!");
            System.exit(0);
        }
        old.renameTo(newname);

        System.out.println("删除一个文件，请输入其名");
        filename=scanner.nextLine();
        File file=new File(filename);
        if(!file.exists()){
            System.out.println("不存在");
            System.exit(0);
        }
        System.out.print("你确实需要删除(Y/N)");
        if(scanner.nextLine().trim().equalsIgnoreCase("Y")){
            file.delete();
        }

        System.out.print("查看目录中所含文件和子目录，请输入目录名:");
        dirname=scanner.nextLine();
        dir=new File(dirname);
        if(!dir.isDirectory()){
            System.out.println("该目录不存在！");
            System.exit(0);
        }
        String[] list=dir.list();
        for(int index=0;index<list.length;index++){
            System.out.println(list[index]);
        }

        System.out.print("查看一个文件的属性，请输入文件名:");
        filename=scanner.nextLine();
        file=new File(filename);
        if(!file.isFile()){
            System.out.println("该文件不存在!");
            System.exit(0);
        }
        System.out.println(file.getName()+"in"+file.getParent()+"is"+file.length()+"bytes"+"\n Can Read:"+file.canRead()+"\n Can Write:"+file.canWrite());

    }
}
