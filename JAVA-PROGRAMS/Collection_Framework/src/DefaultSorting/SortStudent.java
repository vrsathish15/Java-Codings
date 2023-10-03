package DefaultSorting;
import java.util.*;

public class SortStudent {
	public static void main(String[] args) {
		Student s1=new Student(99);
		Student s2=new Student(99);
		Student s3=new Student(99);
		
		
		TreeSet<Student> t=new TreeSet<Student>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		for(Student a:t) {
			System.out.println(a);
		}
		
		
	}

}
