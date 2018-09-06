package Traverse;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Traverse {
    public static void main(String[] a)throws IOException{
    	System.out.println("please input the file_name:");
    	Scanner input=new Scanner(System.in);
  	  	String file_name=input.next();
        showDir(new File(""), new File(file_name));
    }
    static void showDir(File parent_file, File file) throws IOException {
        if (parent_file.getName() == "")
        {
        	System.out.println("this is parent_file  " + file.getName());
        }
        else
        {
        	System.out.println("this is " + parent_file + "'s child_file " + file.getName());
        }
        	
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++)
                showDir(file , files[i]);
        }
    }
}