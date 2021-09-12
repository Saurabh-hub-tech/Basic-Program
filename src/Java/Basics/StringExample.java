package Java.Basics;

public class StringExample {

	public static void main(String[] args) {
		
		String str= "The rains have stops";
		
		String testval[]=str.split(" ");
		
		for(int i=0; i< str.length(); i++ ){
			
		System.out.println(testval[i]);	
		
		}
//		String testval[]=str.split(" ");
//	      for (int i=0;i<str.length();i++){
//	          
//	          System.out.println(testval[i]);
//	          
//	      } 
	      
	      int l=testval.length;
	        System.out.println(l);
	    
				
	//}
	

//	String name ="SAURABH";
//	String rev="";
// for(int i=name.length()-1;i>=0;i--) {
//	 
//	 rev=rev+ name.charAt(i);
// }
//		
// System.out.println(rev);		
		
}
}




