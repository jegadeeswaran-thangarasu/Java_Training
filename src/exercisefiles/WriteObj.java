package exercisefiles;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObj {
	public static void main(String arg[]) throws Exception	{
		FileOutputStream fos = new FileOutputStream ("emp.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Emp ob ;
		for ( int i=0; i<10;i++) {
			ob =  new Emp(i,"name"+i) ;
			oos.writeObject(ob) ;
		}
	}
}
