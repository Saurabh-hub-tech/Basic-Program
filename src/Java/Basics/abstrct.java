package Java.Basics;

import Java.Basics.abstrct.Car;

abstract public class abstrct {
	
	int nooftyers;
	abstract void start(); 
	
	static class Car extends abstrct {
		
		void start()
		{
			System.out.println("Start with Key");
			
		}
	}
		
	
	class scooter extends abstrct{
		
		void start()
		{
			System.out.println("Start with kick");
			
		}
		
	}
}

class Test{
	
	public static void main(String[] args) {
		
		Car a = new Car();
		
		a.start();
		
		//abstrct obj= new scooter();
		
		//obj.start();
		
		
	}

}
