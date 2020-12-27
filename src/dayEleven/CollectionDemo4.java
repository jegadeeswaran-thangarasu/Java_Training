package dayEleven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CollectionDemo4 {
	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		prop.load(new FileInputStream("config.properties"));
		String factoryclass = prop.getProperty("factory");
		System.out.println(factoryclass);
	}
}


//take these collection as home work dictionary class, HashTable, queue, stack