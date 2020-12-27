package exercisefiles;

import java.io.File;

class DirList{
	public static void main(String args[]){
		String dirname="src";
		File f1=new File(dirname);
		if(f1.isDirectory()){
			String s[]=f1.list();
			for(int I=0;I<s.length;I++){ 
				System.out.println(s[I]); 
			}  
		}  
	}
}

