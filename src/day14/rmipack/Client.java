package day14.rmipack;

import java.rmi.Naming;

public class Client {
	public static void main(String[] args) throws Exception{
		Stock stock=(Stock)Naming.lookup("rmi://192.168.29.1:1099/mystockservice");
		int stockprice=stock.getStockPrice("coda");
		System.out.println("The stock price of coda is...:"+stockprice);
	}
}