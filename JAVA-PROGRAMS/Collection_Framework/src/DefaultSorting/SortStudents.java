package DefaultSorting;
import java.util.*;
import java.util.Comparator;
import java.util.TreeSet;


class SortStudentsbyAge implements Comparator<students1>{
	public int compare(students1 x,students1 y) {
		return x.age-y.age;
	}
}
class SortStudentsbymark implements Comparator<students1>{
	public int compare(students1 x,students1 y) {
		return x.mark-y.mark;
	}
}
 
class students1{
	int age;
	int mark;

	students1(int age, int mark) {
		this.age=age;
		this.mark=mark;
	}
	public String toString() {
		return "Age:"+age+"mark:"+mark;
	}
}


public class SortStudents {
	public static void main(String[] args) {
		students1 c1=new students1(21,67);
		students1 c2=new students1(23,64);
		students1 c3=new students1(22,65);

		
		SortStudentsbyAge age=new SortStudentsbyAge();
        SortStudentsbymark mark =new SortStudentsbymark();
		
		TreeSet<students1> tr=new TreeSet<>(mark);

		tr.add(c1);
		tr.add(c2);
		tr.add(c3);

		for(students1 s:tr) {
			System.out.println(s);
		}

	}

}

