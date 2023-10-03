package MapExample;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class StoreStudent {
	public static void main(String[] args) {
		Student s1=new Student(21);
		Student s2=new Student(22);
		LinkedHashMap<Student, String> stu=new LinkedHashMap<>();
		stu.put(s1,"nk");
		stu.put(s2,"kumar");
		
		Set<Student> k=stu.keySet();
		
		for(Student s:k) {
			System.out.println(s+" Name: "+ stu.get(s));
		}
		Iterator<Student> i= k.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
