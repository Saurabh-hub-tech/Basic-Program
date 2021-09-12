package Java.Basics;

public  abstract class USBank {

	public abstract void loan();
	
	static void credit() {
		
		System.out.println("Banks Credit");		
	}
	
	public void debit() {
		
		System.out.println("Bank Debit");
		
	}
}
