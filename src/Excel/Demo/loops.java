package Excel.Demo;

public class loops {

	public static void main(String[] args) {
		int i;
		int b=5;
		int a=0;
		for(i=4;i>=1;i--) {
			
			a=b*i;
			b=a;
			//System.out.println(b);
		}
		System.out.println(b);
		
	}

}
