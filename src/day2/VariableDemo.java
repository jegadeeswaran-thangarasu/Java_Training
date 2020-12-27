package day2;

public class VariableDemo {
	//any variable declared in the class outside methods and inner classes is a instance variable
	//any variable declared inside a method is a local variablle
	//any variabke declared with keyword static is a class variable
	public static void main(String[] args) {
		ClassRoom javaclassroom = new ClassRoom();
		ClassRoom pythonclassroom = new ClassRoom();
		javaclassroom.teach();
		javaclassroom.teach();
		javaclassroom.teach();
	}
}

class Student {
	public Student() {
		System.out.println("Student obj created...");
	}
}
class Teacher {
	public Teacher() {
		System.out.println("Teacher obj created...");
	}
}
class Canteen {
	public Canteen() {
		System.out.println("Canteen obj created...");
	}
}

class ClassRoom {
	static Canteen c = new Canteen();//class variable
	Teacher t = new Teacher();//instance variable
	public void teach() {
		Student s = new Student();
	}
}
