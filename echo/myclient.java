package echo;

import java.net.*; 
import java.io.*; 

public class myclient
{
	public static void main(String[] args)throws Exception 
	{ 
		Socket server=new Socket("localhost",80); 
		BufferedReader in=new BufferedReader(new InputStreamReader(server.getInputStream())); 
		PrintWriter out=new PrintWriter(server.getOutputStream()); 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		while(true) 
		{ 
			String str=br.readLine(); 
			out.println(str); 
			out.flush(); 
			if(str.equals("exit"))
			{ 
				break; 
			} 
			System.out.println(in.readLine()); 
		} 
		server.close(); 
	} 
}