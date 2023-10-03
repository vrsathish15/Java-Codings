package DefaultSorting;
import java.util.*;
import java.util.Comparator;


class SortStudentbyAge implements Comparator<student>{
	public int compare(student x,student y) {
		return x.age-y.age;
	}
}
class SortStudentbymark implements Comparator<student>{
	public int compare(student x,student y) {
		return x.mark-y.mark;
	}
}
 
class student{
	int age;
	int mark;

	student(int age, int mark) {
		this.age=age;
		this.mark=mark;
	}
	public String toString() {
		return "Age:"+age+"mark:"+mark;
	}
	
	
}


public class Comparator {
	public static void main(String[] args) {
		student c1=new student(21 , 67);
		student c2=new student(21 , 67);
		student c3=new student(21 , 67);
		
		
		SortStudentbyAge age=new SortStudentbyAge();
		SortStudentbymark mark =new SortStudentbymark();
		
		TreeSet<student> tr=new TreeSet<student>();
		
		tr.add(c1);
		tr.add(c2);
		tr.add(c3);
		
		for(student s:tr) {
			System.out.println(s);
		}
		
	}

}
