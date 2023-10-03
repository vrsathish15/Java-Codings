package MapExample;

import java.util.LinkedHashMap;
import java.util.Set;

public class main {
	public static void main(String[] args) {


		LinkedHashMap<String, Double> em= new LinkedHashMap<>();

		em.put("nithish", 9.8);
		em.put("uma", 8.9);
		em.put("sathish", 2.9);

		Set<String> s=em.keySet();
		for(String st:s) {
			System.out.println(em.get(st));
			System.out.println("salary of : "+st+" is "+ em.get(st)+" LPA!");
		}
	}
}
