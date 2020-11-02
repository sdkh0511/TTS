package Assignments;
import java.util.*;

public class myloop {
	
	//Declare the arraylist to store the numbers
	ArrayList<Integer> myNumbers = new ArrayList<Integer>();

	// Empty constructor
	public myloop() {
		
	}
	

	// Method to get the smallest of the number from the array
	public int getSmallest() {
		// Sort the Arraylist now
		Collections.sort(myNumbers);
		return  myNumbers.get(0);
		
	}
	
	// Method to get the largest of the number entered from the array of 5 numbers
	public int getLargest() {
		// Sort the Arraylist now
		Collections.sort(myNumbers);
		return  myNumbers.get(4);
		
	}
	
	//Method to get the sum of all the numbers in the array list
	public int getSum() {
		//Loop through the arraylist
		int mysum = 0 ;
		
		for (int i : myNumbers) {
		      mysum = mysum + i ;
		    }
		return  mysum;
		
	}
	
	// Method to get the product of all the numbers in the array list
	public int getProduct() {
		//Loop through the arraylist
		int myproduct = 1 ;
		
		for (int i : myNumbers) {
			myproduct = myproduct * i ;
		    }
		return  myproduct;
		
	}

	public static void main(String[] args) {
		
		// Create the object of the class
		myloop objmyloop = new myloop() ;
		
		//Create the scanner object for user to enter the numbers and program to get those numbers
		Scanner userEntry = new Scanner(System.in);
		
		//This variable will store the value user enters
		int userInt = 0 ;
		
		//This variable will control how many times user will enter the values, since the assignment asked for 5, we will control using this number
		int i = 1 ;
		
		do {
	        try {
	            System.out.println("Please Enter Number-" + i );
	            userInt = Integer.parseInt(userEntry.nextLine()); 
	            objmyloop.myNumbers.add(userInt);
	            
	            i = i +1 ;
	        }
	        catch(NumberFormatException e) {
	            System.out.println("You have entered a Non-Numeric value, Please enter a numeric Value");
	            
	            
	        }
	    } while ( i < 6 );
		
		// Close the scanner
		userEntry.close();
		
		
		// Printing the Smallest Number entred by user
		int smallestNum = objmyloop.getSmallest();
		System.out.println("Smallest Number entred : " + smallestNum) ;
		
		// Printing the Smallest Number entred by user
		int largestNum = objmyloop.getLargest();
		System.out.println("Smallest Number entred : " + largestNum) ;
		
		//Printing the sum of all the numbers entered by user
		int totalsum = objmyloop.getSum();
		System.out.println("Smallest Number entred : " + totalsum) ;
		
		//Printing the sum of all the numbers entered by user
		int myprod = objmyloop.getProduct();
		System.out.println("Product of all Number entred : " + myprod) ;
		
	
		
	    
	}

}
