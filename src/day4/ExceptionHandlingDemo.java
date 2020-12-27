package day4;

import java.util.Scanner;

public class ExceptionHandlingDemo {
	public static void main(String []args) {
		Child baby = new Child() ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter item...");
		String item = scan.next();
		Dog jimmy = new Dog();
		baby.playWithDog(jimmy,item);
	}
}

class Dog {
	public void play(String item) throws DogExceptions {
		if(item.equals("stick")) {
			throw new DogBiteException("You beat I bite...");
		}
		else if(item.equals("stone")) {
			throw new DogBarkException("You throw I bow bow...");
		}
		else if(item.equals("buiscuit")) {
			throw new DogHappyException("yummy yummy...");
		}
	}
}

class Child {
	public void playWithDog(Dog dog,String item) {
		try {
			dog.play(item);
		}catch(DogExceptions dee) {
			dee.visit();
		}
	}
}

abstract class DogExceptions extends Exception {
	public abstract void visit();
}


class DogBiteException extends DogExceptions {
	String msg;
	public DogBiteException(String msg) {
		this.msg = msg;
	}
	public String toString() {
		return "Exception..:"+msg;
	}
	public void visit() {
		new IndiaHandler911().handle(this);
	}
}

class DogBarkException extends DogExceptions {
	String msg;
	public DogBarkException(String msg) {
		this.msg = msg;
	}
	public String toString() {
		return "Exception..:"+msg;
	}
	public void visit() {
		new IndiaHandler911().handle(this);
	}
}

class DogHappyException extends DogExceptions {
	String msg;
	public DogHappyException(String msg) {
		this.msg = msg;
	}
	public String toString() {
		return "Exception..:"+msg;
	}
	public void visit() {
		new IndiaHandler911().handle(this);
	}
}
abstract class Handler911 {
	public abstract void handle(DogBiteException e);
	public abstract void handle(DogBarkException dre);
	public abstract void handle(DogHappyException dre);
}

class IndiaHandler911 extends Handler911 {
	public void handle(DogBiteException e) {
		e.printStackTrace();
		System.out.println("I will write the logic to handle this error...");
		System.out.println("take him to hospital");
	}
	public void handle(DogBarkException dre) {
		dre.printStackTrace();
		System.out.println("the logic to handle the dog bark written");
		System.out.println("dont panic...");
	}
	public void handle(DogHappyException dre) {
		dre.printStackTrace();
		System.out.println("lovely dog...");
	}
	
}