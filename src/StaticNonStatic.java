
public class StaticNonStatic {

	int a;
	static int b;
	public static void display() {
		System.out.println("HCL will crack Interview");
		
	}
	
	public static void main(String[] args) {
		StaticNonStatic.b=2;
		StaticNonStatic.display();
		StaticNonStatic obj1=new StaticNonStatic();
		obj1.a=5;
		System.out.println("a");
	}
	
	

}
