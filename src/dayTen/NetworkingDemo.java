package dayTen;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class NetworkingDemo {
	public static void main(String[] args) throws Exception{
		URL url = new URL("https://google.com/index.html");
		ReadFromURL rfurl = new ReadFromURL();
		rfurl.readFromUrl(url);
	}
}

class ReadFromURL {
	public void readFromUrl(URL url) throws Exception{
		URLConnection urlcon = url.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
		FileWriter writer = new FileWriter("googe.html");
		int i=0;
		char c[] = new char[128];
		while((i=in.read(c))!=-1) {
			String s = new String(c,0,i);
			System.out.println(s);
			writer.write(c, 0, i);
		}
		writer.close();
	}
}