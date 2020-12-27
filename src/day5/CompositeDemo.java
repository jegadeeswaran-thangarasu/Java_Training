package day5;

public class CompositeDemo {
	public static void main(String[] args) {
		IceCream iceCream = new VanilaCream(
				new VanilaCream(new VanilaCream(new Nuts(new StrawberryCream(new Nuts())))));
		System.out.println("The cost of vanila " + iceCream.cost());
	}
}

abstract class IceCream {
	public abstract int cost();
}

abstract class Cream extends IceCream {
}

abstract class IceCreamIngredients extends IceCream {
}

class VanilaCream extends Cream {
	IceCream ic;

	public VanilaCream() {

	}

	public VanilaCream(IceCream cream) {
		this.ic = cream;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if (ic != null) {
			return 10 + ic.cost();
		} else {
			return 10;
		}
	}
}

class StrawberryCream extends Cream {
	IceCream ic;

	public StrawberryCream() {

	}

	public StrawberryCream(IceCream cream) {
		this.ic = cream;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if (ic != null) {
			return 15 + ic.cost();
		} else {
			return 15;
		}
	}
}

class Nuts extends IceCreamIngredients {
	IceCream ic;

	public Nuts() {

	}

	public Nuts(IceCream cream) {
		this.ic = cream;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if (ic != null) {
			return 5 + ic.cost();
		} else {
			return 5;
		}
	}
}

class Cherrys extends IceCreamIngredients {
	IceCream ic;

	public Cherrys() {

	}

	public Cherrys(IceCream cream) {
		this.ic = cream;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if (ic != null) {
			return 5 + ic.cost();
		} else {
			return 5;
		}
	}
}

class FruitFalvour extends IceCreamIngredients {
	IceCream ic;

	public FruitFalvour() {

	}

	public FruitFalvour(IceCream cream) {
		this.ic = cream;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if (ic != null) {
			return 10 + ic.cost();
		} else {
			return 10;
		}
	}
}