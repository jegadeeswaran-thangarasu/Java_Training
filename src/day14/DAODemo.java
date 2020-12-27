package day14;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import day13.ConnectionUtility;
public class DAODemo {
	public static void main(String[] args) {
		CustomerDTO cdto=new CustomerDTO();
		cdto.setCustomeraddress("chennai");
		cdto.setCustomerid(100);
		cdto.setCustomername("ramu");
		CustomerServiceDAO cdao=new CustomerServiceDAOImpl();
		cdao.createObject(cdto);
	}
}
abstract class CustomerServiceDAO extends CustomerDAO{
	public abstract String searchByCity(Object id);
}
class CustomerServiceDAOImpl extends CustomerServiceDAO{
	@Override
	public String searchByCity(Object id) {
		CustomerDTO cdto=(CustomerDTO)getObjectByID(id);
		if(cdto.getCustomeraddress().contains("")) {
			return cdto.getCustomername();
		}
		else {
			return "no user from that city....";
		}
	}
}
abstract class DAO{
	public abstract void createObject(Object o);
	public abstract void updateObject(Object o);
	public abstract Object getObjectByID(Object id);
	public abstract Object getObjectByName(Object name);
	public abstract void deleteObject(Object id);
}
class CustomerDTO implements Serializable{//in instance representation of a row in a table
	private Integer customerid;
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	private String customername;
	private String customeraddress;
	
}
class CustomerDAO extends DAO{
	@Override
	public void createObject(Object o) {
		Connection con=null;
		try {
		CustomerDTO cdto=(CustomerDTO)o;
		con=ConnectionUtility.getConnectionUtility().getConnection();
		PreparedStatement ps=con.prepareStatement("insert into customer_master values (?,?,?)");
		ps.setInt(1, cdto.getCustomerid());
		ps.setString(2, cdto.getCustomername());
		ps.setString(3, cdto.getCustomeraddress());
		ps.execute();
		con.commit();
		}catch(Exception e) {
			e.printStackTrace();
			try {
				con.rollback();
			}catch(Exception ee) {
				ee.printStackTrace();
			}
		}
	}
	@Override
	public void updateObject(Object o) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Object getObjectByID(Object id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object getObjectByName(Object name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteObject(Object id) {
		// TODO Auto-generated method stub
		
	}
}