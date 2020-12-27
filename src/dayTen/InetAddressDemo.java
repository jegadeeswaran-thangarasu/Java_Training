package dayTen;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws Exception {
		InetAddress inet = InetAddress.getLocalHost();
		System.out.println(inet);
		
		inet = Inet6Address.getByName("www.google.com");
		System.out.println(inet);
		
		InetAddress inett[] = Inet6Address.getAllByName("www.yahoo.com");
		for(InetAddress in:inett) {
			System.out.println(in);
		}
		
		Runtime r = Runtime.getRuntime();
		int noofprocessors = r.availableProcessors();
		System.out.println(noofprocessors);
		
//		r.exit(1);
//		System.exit(1);
//		r.gc();
//		System.gc();
//		
		r.exec("notepad.exe");
	}
}
