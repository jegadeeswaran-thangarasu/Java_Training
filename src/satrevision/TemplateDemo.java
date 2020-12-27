package satrevision;

public class TemplateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DominosPizza domino = new JegadeesDominosPizza();
		domino.orderPizza();
	}

}

abstract class DominosPizza {
	public abstract void clean();
	public abstract void wearCookingDress();
	public abstract void processIngredients();
	public abstract void processWheat();
	
	final public void cookingMethod() {
		System.out.println("secret cooking method...");
	}
	final public void orderPizza() {
		clean();
		wearCookingDress();
		processIngredients();
		processWheat();
		cookingMethod();
	}
}

class JegadeesDominosPizza extends DominosPizza {

	@Override
	public void clean() {
		System.out.println("cleaning process...");
	}

	@Override
	public void wearCookingDress() {
		// TODO Auto-generated method stub
		System.out.println("wear cooking dress process...");
	}

	@Override
	public void processIngredients() {
		// TODO Auto-generated method stub
		System.out.println("Ingredients process...");
	}

	@Override
	public void processWheat() {
		// TODO Auto-generated method stub
		System.out.println("wheat process...");
	}	
}