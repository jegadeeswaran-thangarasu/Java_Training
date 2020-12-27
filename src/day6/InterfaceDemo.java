package day6;

import java.util.Scanner;

public class InterfaceDemo {
	public static void main(String[] args) {
		Human shoiab = new Human();// in 1974 human - behavioural class and factories are creational class
		//remember interfaces have to be implemented in factory classes
		
	}
}
// if interface has only one methods - then it is called functional interface
// no methods - marker interface
//an interface is a pure abstract class, all methods are abstract by default
//interface cannot have constructor
//interface can have constants which should be static and final

interface Doctor {
	static final String s = "hello world....";
	public void doCure();
}

class Human implements Doctor {

	@Override
	public void doCure() {
		// TODO Auto-generated method stub
		System.out.println("do cure called...");
	}
	
}