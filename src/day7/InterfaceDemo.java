package day7;

public class InterfaceDemo {
	public static void main(String[] args) {
		Stockists.cs();
		Stockists stock = new StockistsImpl();
		stock.calculateStock();
		stock.stock();
	}
}

interface Stockists {
	public void stock();
	public default void calculateStock() {
		System.out.println("write the logic for stock calculation here...");
	}
	static void cs() {
		System.out.println("static method of interface called...");
	}
}

class StockistsImpl implements Stockists {

	@Override
	public void stock() {
		// TODO Auto-generated method stub
		System.out.println("stock method called...");
	}
	public void calculateStock() {
		System.out.println("the default overidden...");
	}
}