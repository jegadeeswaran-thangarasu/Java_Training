package dayEleven;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class InternationalDemo {
	public static void main(String[] args) throws Exception {
		Locale locale = Locale.getDefault();
		Locale talocale = new Locale("te");
		Locale.setDefault(talocale);
		locale=Locale.getDefault();
		System.out.println(locale);
		
		ResourceBundle rb = ResourceBundle.getBundle("dayEleven.Dictionary",locale);
		
		String value = rb.getString("hello");
		System.out.println(value);
		
		FileOutputStream fos = new FileOutputStream("abc.html",true);
		//fos.write(value.getBytes());
		//FileWriter fw = new FileWriter("copy2.properties");
		//fw.close();
		//Properties prop = new Properties();
		String header = "<meta http-equiv = Content-Type content=text/html;charset=utf-8>";
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos,Charset.forName("UTF-8")));
		bw.write(header);
		bw.write(value);
		bw.close();
		
		
		
		
	}
}
