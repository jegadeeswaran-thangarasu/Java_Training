package exercisefiles;

import java.io.File;
import java.io.FilenameFilter;

class onlyext implements FilenameFilter{
	String ext;
	public onlyext(String e) {   
		ext="."+e;   
	}
	public boolean accept(File dir, String name) {
		return name.endsWith("y2");
	}    
}
class DirListOnly {
	public static void main(String args[]){
		String dirname="src";
		File f1=new File(dirname);
		FilenameFilter only=new onlyext("java");
		String s[]=f1.list(only);
		for (int i=0;i<s.length;i++) {
			System.out.println(s[i]);   
		}    
	}
}
