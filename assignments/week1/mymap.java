package Assignments;

import java.util.*;

public class mymap {

	//create the hashmap for cars
	HashMap<String, String> mycars = new HashMap<String, String>();
	
	public mymap() {
		
	}
	
	public void loadmap() {
		
		// Add keys and values (Model, Make)
		mycars.put("CIVIC", "HONDA");
		mycars.put("PILOT", "HONDA");
		mycars.put("CR-V", "HONDA");
		mycars.put("ODYSSEY", "HONDA");
		mycars.put("CAMRY", "TOYOTA");
		mycars.put("COROLLA", "TOYOTA");
		mycars.put("YARIS", "TOYOTA");
		mycars.put("SIENNA", "TOYOTA");
		mycars.put("SONATA", "HYUNDAI");
		mycars.put("TUCSON", "HYUNDAI");
		mycars.put("MUSTANG", "FORD");
		mycars.put("ESCAPE","FORD");
		
		
	}
	
	// Check if model exist
	
	public boolean isModelAvailable(String pmodel) {
		
		return mycars.containsKey(pmodel) ;
	}
	
	//Method to get the Make of the model
	public String getMake(String pmodel) {
		
		String myMake = mycars.get(pmodel) ;
		
		return myMake ;
	}

	
	public static void main(String[] args) {
		
		// Get the object of the mymap class
		
		mymap mymapObj = new mymap() ;
		
		//load the hash map for the cars
		mymapObj.loadmap();
		
		//create the scanner object to get the model that user wants to enquire
		Scanner userEntry = new Scanner(System.in);
		
		//This variable will store the value user enters
		String userModel = "" ;
		do {
			System.out.println("Please Enter the car(Model) you are looking for : " );
	        userModel = userEntry.nextLine(); 
	        if (userModel.length() <=0 ) {
	        	System.out.println("You have entered Nothing, please enter something");
	        }
		} while (userModel.length() <= 0) ;
		
		//close the scanner
		userEntry.close();
		
		// if the model is present
		boolean iscarAvailable = mymapObj.isModelAvailable(userModel.toUpperCase()) ;
		
		if (iscarAvailable) {
			
			String Make = mymapObj.getMake(userModel.toUpperCase()) ;

			System.out.println("Oh, you're looking for a " + userModel + "? Our " + Make + " selection is right over here...");
		} else {
			System.out.println(" We are sorry, We do not have the model, we will get back to you when it is back in stock ");
		}
		
		
		
           
		
	}

}
