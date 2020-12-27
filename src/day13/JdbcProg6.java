package day13;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class JdbcProg6 {
	public static void main(String[] args) throws Exception {
		Connection con = ConnectionUtility.getConnectionUtility().getConnection();
//		CallableStatement cs = con.prepareCall("{call myproc()}");
//		int i = cs.executeUpdate();
//		System.out.println(i);
//		con.commit();
		
		CallableStatement cs = con.prepareCall("{call myproc2(?)}");
		
		cs.registerOutParameter(1, Types.INTEGER);
		
		cs.execute();
		
		System.out.println("No of rows...: "+cs.getInt(1));
	
		CallableStatement cs2 = con.prepareCall("{call myproc3(?,?)}");
		
		cs2.setInt(1, 0);
		cs2.setString(2, "ramu");
		cs2.execute();
		con.commit();
		
		CallableStatement cs3 = con.prepareCall("{call myproc4(?,?)}");
		cs3.setString(1, "ramu");
		cs3.registerOutParameter(1, Types.INTEGER);
		cs3.execute();
		int flag = cs.getInt(2);
		System.out.println("the flag value of ramu is ...: "+flag);
		
	}
}
