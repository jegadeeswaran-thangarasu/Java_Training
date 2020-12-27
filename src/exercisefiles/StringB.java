package exercisefiles;

import java.io.ByteArrayInputStream;
import java.io.SequenceInputStream;
import java.io.StringBufferInputStream;

public class StringB {	
	public static void main(String arg[]) throws Exception	{
	ByteArrayInputStream bis = new ByteArrayInputStream("Concourse".getBytes()) ;
	StringBufferInputStream sbis = new StringBufferInputStream("Information") ;
	SequenceInputStream sis = new SequenceInputStream(bis,sbis) ;
	int ch ;
	while ((ch=sis.read())!=-1)
		System.out.print((char)ch) ;
	}
}
