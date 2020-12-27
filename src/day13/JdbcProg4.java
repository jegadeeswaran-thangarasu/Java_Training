package day13;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
public class JdbcProg4 {
     public static void main(String []args)throws Exception{
    	 Connection con=ConnectionUtility.getConnectionUtility().getConnection();
    	 Statement st=con.createStatement();
   	     st.executeUpdate("insert into users values(1,'prem','strong',1)");
   	     st.executeUpdate("insert into users values(2,'ram','strong',1)");
      	 st.executeUpdate("insert into users values(3,'kumar','strong',1)");
   	     //System.out.println(i);
         
        //  i=st.executeUpdate("delete from users where userid=1");
         //i=i=st.executeUpdate("delete from users where flag=1");
         con.commit();
         ResultSet rs=st.executeQuery("select * from users");
         ResultSetMetaData rsmd=rs.getMetaData();
         int colcount=rsmd.getColumnCount();
         for(int i=1;i<=colcount;i++) {
        	 System.out.print(rsmd.getColumnName(i)+"\t");
         }
         System.out.println();
         while(rs.next()){
        	 for(int i=1;i<=colcount;i++) {
            	 System.out.print(rs.getString(i)+"\t");
             }
        	 System.out.println();
         }
         
     }
}