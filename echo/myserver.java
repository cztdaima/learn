package echo;

import java.io.*; 
import java.net.*; 

public class myserver extends Thread
{ 
	private Socket cq ; 
	public myserver(Socket cq) 
	{ 
		this.cq = cq; 
	} 
	public void run() 
	{ 
		try 
		{ 
			BufferedReader in=new BufferedReader(new InputStreamReader(cq.getInputStream())); 
			PrintWriter out=new PrintWriter(cq.getOutputStream()); 
			while(true) 
			{ 
				String str=in.readLine(); System.out.println(str); 
				out.println("message: "+str); 
				out.flush(); 
				if(str.equals("exit"))
					break; 
			} 
		} 
		catch(IOException e) 
		{ 
			System.out.println(e.getMessage()); 
		} 
	}
	public static void main(String[] args) throws IOException
	{ 
		ServerSocket server=new ServerSocket(80); 
		while(true) 
		{ 
			Socket s=server.accept();
			new myserver(s).start();
		} 
	} 
}