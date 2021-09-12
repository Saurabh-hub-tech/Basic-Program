package Java.Basics;

public class encpsulation {
	
	private int sal;
	private String name;
	private int id;
	
	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		
		encpsulation e=new encpsulation();
		
		e.setSal(500);
		e.setName("SAURABH");
		e.setId(355285);
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getSal());
		
}
}
