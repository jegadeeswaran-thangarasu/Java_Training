 package dayTen;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileIoDemo {
	public static void main(String[] args) throws Exception{
		ReadFile rf = new ReadFile();
		rf.readFile();
	}
}

class ReadFile {
	
	public void readFile() throws Exception {
		FileInputStream fis = new FileInputStream("abc");
		FileReader fir = new FileReader("abc");
		
		
		int i=0;
		int eof = -1;
		
		byte b[] = new byte[4];
		while((i=fis.read(b))!=eof) {
			String s = new String(b,0,i);
			System.out.print(s);
			new WriteFile().writeFileInBytes(b, 0, i);
		}
		System.out.println();
		
		int ii=0;
		char c[] = new char[4];
		while((ii=fir.read(c))!=eof) {
			String s = new String(c,0,ii);
			System.out.print(s);
			new WriteFile().writeFileInChar(c, 0, ii);
		}
	}
}


class WriteFile {
	public void writeFileInBytes(byte b[],int offset, int length) throws Exception {
		FileOutputStream fos = new FileOutputStream("abccopy",true);
		fos.write(b, offset, length);
	}
	public void writeFileInChar(char c[], int offset, int length) throws Exception {
		
		try(FileWriter fow = new FileWriter("abccopy1",true)) {
			fow.write(c, offset, length);
		}catch(Exception e) {e.printStackTrace();}
	}
}

class ReadFromKeyBoard {
	public void read() throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("abc")));
		
		BufferedReader inn = new BufferedReader(new InputStreamReader(System.in));
		String s = inn.readLine();
	}
}