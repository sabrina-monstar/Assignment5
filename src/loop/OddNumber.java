package loop;

public class OddNumber {
	
	public static void main(String args[])   
	{  
		
	int number=20;  int max = 0; 

	System.out.print("List of odd numbers from 0 to "+number+": "); 
	
	for (int i=0; i<=number; i++)  
		
	{  
 
	if (i%2!=0)   
		
	{ 	
		if (i > max) {
	        max = i;  
	        
		}
			
	System.out.print(i + " ");  	
	
	}
	
	}

	System.out.print("\n Maximum odd number " + max);

	}
}
