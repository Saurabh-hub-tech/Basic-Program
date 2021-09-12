package Java.Basics;

public class EncpSuperthis {
	
	private int emp_id;
	
	public void setEmId(int empid) {
		
		emp_id=empid;
	}
	public int getEmpId() {
		
		return emp_id;
				
		
	}
			
			
	public static void main(String[] args) {
		EncpSuperthis obj=new EncpSuperthis();
		
		obj.setEmId(1);
		System.out.print(obj.getEmpId());
		
		
		
		
	}

}
