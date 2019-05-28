// Example code to test code quality

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class HelloWorld {

		public static void main (String[] args) throws java.lang.Exception
		{
			// call a dateService and print result 
			printService("Today is the " + dateService());
			
			// initial variable for the loop
	        int x = 1; 
	  
	        // Exit when x becomes greater than 4 
	        while (x <= 10) 
	        { 
	        	// call print service
	        	printService ("Hello World the " + x + ". time.");
	            
	            // Increment the value of x for 
	            // next iteration 
	            x++; 
	        } 
		}

		// Special print service 
		private static void printService(String string) {
			System.out.println(string); 
			
		}

		// Special date service 
		private static String dateService() {
			Calendar cal  = Calendar.getInstance();
			Date     time = cal.getTime();
			DateFormat formatter = new SimpleDateFormat();
			
			return formatter.format( time );
		}
}
