package cut_string;
import java.util.Scanner;


public class cut_string 
{

    public static void main(String[] args) throws Exception 
    {
    	Scanner input = new Scanner(System.in);
    	System.out.print("ÇëÄúÊäÈë×Ö·û´®:");
    	String str = input.next(); 
    	System.out.print("ÇëÄúÊäÈë½ØÈ¡³¤¶È:");
    	int length = input.nextInt(); 
        splitString(str, length);
        System.out.println(splitString(str, length));
    }

    public static String splitString(String str, int length)throws Exception 
    {

        if (str == null || str.length() < 1 || length < 1) 
            return "";
        int byteNum = str.length();
        if (length > byteNum) 
            length = byteNum;

        int wordCount = 0;
        byte[] gbks = str.getBytes("GBK");
        
        for (int i = 0; i < length; i++) 
        {
            int val = gbks[i];
            if (val < 0) 
                wordCount++;
        }

        if (wordCount % 2 == 0)
            return str.substring(0, (length - (wordCount / 2)));

        return str.substring(0, (length - (wordCount / 2) - 1));

    }
}