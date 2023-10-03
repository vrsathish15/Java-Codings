package programs;
import java.util.*;

public class Queue {
	public static void main(String[] args) {
		PriorityQueue<Integer> pr=new PriorityQueue<>();
		pr.add(10);
		pr.add(2);
		pr.add(5);
		pr.add(12);
		pr.add(3);
		System.out.println(pr);
		System.out.println(pr.peek());
		pr.clear();
		System.out.println(pr.isEmpty());
	}

}
