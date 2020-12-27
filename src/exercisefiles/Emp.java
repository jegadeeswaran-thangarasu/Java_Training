package exercisefiles;

import java.io.Serializable;

public class Emp implements Serializable {
	public int eno ;
	public String ename ;
	Emp(int a, String m) {	
		eno=a ;
		ename=m; 
	}
	void print() {
		System.out.println(eno + " \t:\t " + ename ) ;
	}
}
