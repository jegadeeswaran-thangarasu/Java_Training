package day13;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Statement;
public class JdbcProg3 {
     public static void main(String []args) {
      try {
    	  Connection con=ConnectionUtility.getConnectionUtility().getConnection();
    	  Statement st=con.createStatement();
    	  st.execute("insert into users values(1,'ram','strong',1)");
    	  st.execute("insert into users values(1,'ram','strong',1)");
    	  st.execute("insert into users values(1,'ram','strong',1)");
       // con.commit();
      }	catch (Exception e) {e.printStackTrace();} 
     }
}