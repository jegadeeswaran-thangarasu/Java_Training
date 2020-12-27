package exercisefiles;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObj {
	public static void main(String arg[])throws Exception {
	    FileInputStream fis = new FileInputStream("abc");
	    ObjectInputStream ois = new ObjectInputStream(fis);
		Emp ob ;
		while((ob = (Emp) ois.readObject())!=null) {
			ob.print() ;	
		}
	}
}
