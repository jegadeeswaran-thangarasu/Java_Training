package myPractice;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stockists.cs();
		StockistsImpl stock = new StockistsImpl();
		stock.calculateStock();
		stock.stock();
	}
}

interface Stockists {
	public void stock();

	public default void calculateStock() {
		System.out.println("calculate stock method called...");
	}

	static void cs() {
		System.out.println("static method called...");
	}
}

class StockistsImpl implements Stockists {
	@Override
	public void stock() {
		// TODO Auto-generated method stub
		System.out.println("stock method called...");
	}

	public void calculateStock() {
		System.out.println("calculate method called...overriden...");
	}
}