package fundamentos_3;

import java.io.*; 

public class Cor { 

	public static final String ANSI_RESET = "\u001B[0m"; 

	public static final String ANSI_YELLOW = "\u001B[34m"; 


	public static void main(String[] args) 
	{ 
		
		System.out.println(ANSI_YELLOW 
						+ "This text is yellow"
						+ ANSI_RESET); 
	} 
}
