package dayTen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
	ServerSocket ss;Socket s;PrintWriter out;BufferedReader in,keyin;
	public Server() {
		try {
			ss=new ServerSocket(2000);
			ExecutorService es= Executors.newFixedThreadPool(10);
			while(true) {
				s =ss.accept();
				es.execute(()->{
					try {
						keyin=new BufferedReader(new InputStreamReader(System.in));
						System.out.println("server waiting to accept...client socket...");
						
						out=new PrintWriter(s.getOutputStream(),true);
						System.out.println("Please enter message to client..:");
						String msg=keyin.readLine();
						out.println(msg);
						
						in =new BufferedReader(new InputStreamReader(s.getInputStream()));
						String msgFromClient=in.readLine();
						System.out.println("Message From Client..:"+msgFromClient);
					}catch(Exception e) {e.printStackTrace();}
				});
				es.execute(()->{
					try {
						keyin=new BufferedReader(new InputStreamReader(System.in));
						System.out.println("server waiting to accept...client socket thread 2...");
						
						out=new PrintWriter(s.getOutputStream(),true);
						System.out.println("Please enter message to client..:");
						String msg=keyin.readLine();
						out.println(msg);
						
						in =new BufferedReader(new InputStreamReader(s.getInputStream()));
						String msgFromClient=in.readLine();
						System.out.println("Message From Client..:"+msgFromClient);
					}catch(Exception e) {e.printStackTrace();}

				});
			}
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
	public static void main(String[] args) {
		new Server();
	}
}

















//package dayTen;
//
//import java.io.PrintWriter;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//public class Server {
//	ServerSocket ss;
//	Socket s;
//	PrintWriter out;
//	public Server() {
//		try {
//			ss = new ServerSocket(2000);
//			while(true) {
//				System.out.println("server waiting to accept...client socket...");
//				s = ss.accept();
//				out = new PrintWriter(s.getOutputStream(),true);
//				out.println("welcome to server.....");
//				//System.out.println(s);
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	public static void main(String[] args) {
//		new Server();
//	}
//}
