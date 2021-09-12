package Java.Basics;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {

	public static <E> void main(String[] args) {
//		int i = 0;
//		int a[] = new int[2];
//		
//		int i1[]= {1,2,3};
//		
//		
//		System.out.println(i1[4] + "");
//		ArrayList<E> a1 =new ArrayList<E>();
		
		Employee e1=new Employee("Saurabh",6);
		Employee e2=new Employee("Chandan",5);
		Employee e3=new Employee("Pawan",15);
		
		ArrayList<Employee> a2=new ArrayList<Employee>();
		a2.add(e1);
		a2.add(e2);
		a2.add(e3);
		
		//traverse the value
		Iterator<Employee> it = a2.iterator();
		while(it.hasNext()) {
			
			Employee emp =it.next();
			System.out.println(emp.Name);
			System.out.println(emp.Exp);
			
		}
		
		
		
		
		
//		a.add(10);
//		System.out.println(a.get(0));

	}

}
