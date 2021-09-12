package Java.Basics;

import java.util.Scanner;

public class CharacterProgram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str = "PATIL";
		getOccurringChar(str);

	}

	private static void getOccurringChar(String str) {
		int count[]= new int[256];
		
		int len= str.length();
		
		for(int i=0; i< len; i++) {
			
			count[str.charAt(i)]++;
		
		char ch[]= new char[str.length()];
		for(int i=0; i< len; i++) {
			ch[i]=str.charAt(i);
		}
		
		
			
		}
		
		
		
	}

}
