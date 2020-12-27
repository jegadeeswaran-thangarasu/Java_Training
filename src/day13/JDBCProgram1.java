package day13;
import java.sql.Connection;
import java.sql.DriverManager;
public class JDBCProgram1 {
	public static void main(String[] args) throws Exception{
		//Standard steps to talk to database....
		//step 1 - load or register the driver....
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2 - Establish a connection...
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost/coda2","root","root");
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				ConnectionUtility cu1=ConnectionUtility.getConnectionUtility();		
				System.out.println(cu1.getConnection());
				System.out.println(cu1.getConnection());
			}
		}).start();
		
		ConnectionUtility cu2=ConnectionUtility.getConnectionUtility();
		Connection con=cu2.getConnection();
		
		System.out.println("Connection...:"+con);
	}
}
//after you login
//mysql> create schema coda2;
//mysql>use coda2;