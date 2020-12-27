package day13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcProg5 {
	public static void main(String[] args) throws SQLException {
		Connection con = ConnectionUtility.getConnectionUtility().getConnection();
		PreparedStatement ps = con.prepareStatement("select * from users where userif=?");
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a user id");
			int uid = scan.nextInt();
			ps.setInt(1, uid);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString("username"));
			}
		}
	}
}
