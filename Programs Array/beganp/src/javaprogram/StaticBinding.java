package javaprogram;

public class StaticBinding {
	
	
	public static void main(String[] args) {
		Student s=new Student();
		s.display(20);
		s.display("My");
	}

}

class Student{
	void display(int age) {
		System.out.println("Age: "+age);
	}
	void display(String name) {
		System.out.println("Name: "+name);
	}
}
