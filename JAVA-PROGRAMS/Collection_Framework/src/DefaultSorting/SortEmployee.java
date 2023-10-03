package DefaultSorting;

import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	String Ename;
	
	Employee(String Ename){
		this.Ename=Ename;
		
	}
	public String toString() {
		return "Ename:"+Ename;
	}
	
	public int compareTo(Employee e) {
	return this.Ename.compareTo(e.Ename); 
	/*return e.Ename.compareTo(this.Ename);*/
	}
}



public class SortEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("a-sanjay");
		Employee e2=new Employee("b-vijay");
		Employee e3=new Employee("c-ajay");
		System.out.println(e3.compareTo(e1));
		
		TreeSet<Employee> t1=new TreeSet<>();
		
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		
		
		for(Employee ee:t1) {
			System.out.println(ee);
		}
		
		
	}
	
	

}













