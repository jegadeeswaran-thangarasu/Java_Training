package day14.rmipack;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public interface Stock extends Remote {
	public int getStockPrice(String name)throws RemoteException;
}

class StockImpl extends UnicastRemoteObject implements Stock {
	public StockImpl() throws RemoteException {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getStockPrice(String name) throws RemoteException {
		if(name.equals("coda")) {
			return 100;
		}
		else {
			return 50;
		}
	}
}