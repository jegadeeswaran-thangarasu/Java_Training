package day4;

public class TemplateDemo {
	public static void main( String []args) {
		DominosPizza domino = new AkshayDominoPizza();
		domino.orderPizza();
	}
}

abstract class DominosPizza {
	public abstract void clean();
	public abstract void wearCookingDress();
	public abstract void processIngredients();
	public abstract void processWheat();
	final public void cookPizza() {
		System.out.println("secret cooking method....");
	}
	final public void orderPizza() {
		clean();
		wearCookingDress();
		processIngredients();
		processWheat();
		cookPizza();
	}
}

class AkshayDominoPizza extends DominosPizza {
	public void clean() {
		System.out.println("cleaning work....");
	}
	public void wearCookingDress() {
		System.out.println("cooking dress works....");
	}
	public void processWheat() {
		System.out.println("process wheat...");
	}
	public void processIngredients() {
		System.out.println("process ingredients...");
	}
}