package Assignments;

public class car {
	
	// Minimum  3 Instance variables - Requirement- 1
	private String mfr , model , color; 
	private int price ;

	// Empty Constructor - Requirement -2
	public car() {
		
	}
	
	// Constructor using 2 instance variables - Requirement -3
	public car(String pmfr, String pmodel) {
		
		this.mfr = pmfr ;
		this.model = pmodel ;
		
	}
	
	// Constructor using 3 instance variables - Requirement - 4
		public car(String pmfr, String pmodel, String pcolor) {
			
			this.mfr = pmfr ;
			this.model = pmodel ;
			this.color = pcolor ;
		}
	

	// Get methods for Instance Variable -1  -- Requirment - 5
	public String getMfr() {
		return mfr;
	}

	// Get methods for Instance Variable -2  -- Requirment - 5
	public void setMfr(String mfr) {
		this.mfr = mfr;
	}

	// Get methods for Instance Variable -3  -- Requirment - 5
	public String getModel() {
		return model;
	}

	// Set methods for Instance Variable -1  -- Requirment - 6
	public void setModel(String model) {
		this.model = model;
	}

	// Set methods for Instance Variable -2  -- Requirment - 6
	public String getColor() {
		return color;
	}

	// Set methods for Instance Variable -3  -- Requirment - 6
	public void setColor(String color) {
		this.color = color;
	}
	
	// Method that returns Boolean - Requirement - 7
	public boolean isCarRed() {
		
		return  this.color.equalsIgnoreCase("RED");
		
	}
	
	// Method that returns String - Requirement - 8
	public String getMakeModel() {
		
		return this.mfr + "," + this.model ;
	}
	
	
	public static void main(String[] args) {
		
		//Creating car with Empty constructor, all variables should be be null or 0
		car mycar1 = new car() ;
				
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");	
		System.out.println(" Variables after calling Empty Constructors, they shd be all Null or 0");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");	
		
		System.out.println("The Make  of the car: " + mycar1.mfr);
		System.out.println("The Model of the car: " + mycar1.model);
		System.out.println("The Color of the car: " + mycar1.color);
		
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");	
		System.out.println(" Variables after calling All variable Constructors");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");	
		
		car mycar2 = new car("Honda", "Pilot", "Red") ;
		System.out.println("The Make  of the car: " + mycar2.mfr);
		System.out.println("The Model of the car: " + mycar2.model);
		System.out.println("The Color of the car: " + mycar2.color);
		
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");	
		System.out.println(" Calling the Boolean method");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		System.out.println("Is My Car Red  :  "  + mycar2.isCarRed()) ;
		
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");	
		System.out.println(" Calling the String method");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		System.out.println("The make, Model of my car  :  "  + mycar2.getMakeModel()) ;
	}

}
