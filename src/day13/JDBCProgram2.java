package day13;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Statement;
public class JDBCProgram2 {
public static void main(String []args)throws Exception{
	Connection con=ConnectionUtility.getConnectionUtility().getConnection();
	boolean b=con.getAutoCommit();
	con.setAutoCommit(false);
	b=con.getAutoCommit();
	System.out.println(b);
	
	Statement st=con.createStatement();
	//boolean bb=st.execute("create table users(userid int(5),username varchar(40),password varchar(8),flag int(1))");
	//System.out.println(bb);	
	//ACID-Automicity,consistency,isolation,durability
	//automicity and isolation we need to manage the other two are managed by itself
	boolean bb=st.execute("insert into users values(1,'ram','strong',1)");
	
	}
}