package dayTen;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
public class ReplaceCharacterDemo {
	public static void main(String[] args)throws Exception {
		String s="jack and &copy jill went up &copy; the hill";
		ReplaceCharacter rp=new ReplaceCharacter();
		rp.replaceCharacter(s, "&copy;");
	}
}
class ReplaceCharacter {
	public void replaceCharacter(String data,String c) throws Exception {
		ByteArrayInputStream bis=new ByteArrayInputStream(data.getBytes());
		BufferedReader br=new BufferedReader(new InputStreamReader(bis));
		int i=0;
		boolean marked=false;
		while((i=br.read())!=-1) {
			
			char ch=(char)i;
			
			switch(ch) {
			case ' ':{
				if(marked) {
					br.reset();
					System.out.print("&");
					marked=false;
				}
				else {
					System.out.print((char)ch);
				}
				break;
			}
			case '&':{
				if(!marked) {
					br.mark(40);
					marked=true;
				}
				break;
			}
			case ';':{
				if(marked) {
					marked=false;
					System.out.print((char)169);
				}
				break;
			}
			default :{
				if(!marked) {
					System.out.print(ch);
				}
			}
			}
		}
		
	}
}