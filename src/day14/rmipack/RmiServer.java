package day14.rmipack;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class RmiServer {
	public RmiServer() {
		try {
			Stock stockService=new StockImpl();//created a instance of rmiservice
			LocateRegistry.createRegistry(1099);//this will start the rmiregistry.exe(its a justdial like service)
			Naming.bind("rmi://localhost:1099/mystockservice", stockService);
			System.out.println("stock service is running..ready to cater...");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new RmiServer();
	}
}