
package dayTen;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
public class Client {
	Socket s;BufferedReader in,keyin;PrintWriter out;
	public Client() {
		try {
			while(true) {
			keyin=new BufferedReader(new InputStreamReader(System.in));
			s=new Socket("localhost",2000);
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));
 			String msgFromServer=in.readLine();
			System.out.println("Message From Server..:"+msgFromServer);
			
			out=new PrintWriter(s.getOutputStream(),true);
			System.out.println("Enter the message to Server..:");
			String msg=keyin.readLine();
			out.println(msg);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Client();
	}
}















//package dayTen;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.Socket;
//
//public class Client {
//	Socket s;
//	BufferedReader in,keyin;
//	PrintWriter out;
//	
//	public Client() {
//		try {
//			
//			s = new Socket("localhost",2000);
//			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
//			String msgFromServer = in.readLine();
//			System.out.println("Message from server...:"+msgFromServer);
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	public static void main(String[] args) {
//		new Client();
//	}
//}
