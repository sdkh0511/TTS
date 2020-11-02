package Assignments;


public class Pet {
	private String name ,loc ,type; 
	private int age ;
	int wgt ;
	
	// Empty Constructor
	public Pet ()
	{
		
	}
	
	// Constructor with all variables
	public Pet (String pname , int page, String ploc, String ptype) {
		
		this.name=pname;
		this.age=page;
		this.loc=ploc;
		this.type = ptype ;
		
	}
	
	
	
	public int get_age()
	{
		return this.age;
	}
	
	public String get_name()
	{
		return this.name;
		
	}
	public String get_type()
	{
		return this.type;
		
	}
	
	public void set_age(int page) 
	{
		this.age=page;
		
	}
	public void set_name(String pname) 
	{
		this.name=pname;
	}
	
	public void set_location(String plocation) 
	{
		this.loc=plocation;
	}
	
	
	public static void main(String[] args) {
		
		// Creating object using Constructor-1 (No variable)
		Pet p1 = new Pet() ;
		
		// Creating object using constructor-2 (all attributes)a
		Pet p2 = new Pet("Jack", 3, "NC", "Husky") ;
				
				
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");	
		System.out.println(" Variables after calling Empty Constructors, they shd be all Null or 0");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		System.out.println("Name of the Pet-1: " + p1.name);
		System.out.println("Age  of the Pet-1: " + p1.age);
		System.out.println("Loc  of the Pet-1: " + p1.loc);
		System.out.println("Typ  of the Pet-1: " + p1.type);
		
		p1.set_name("FirstPet");
		p1.set_age(7);
		p1.set_location("Golden Retriever");
		
		
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");	
		System.out.println(" Variables after calling setters on Name, age and Loc") ;
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			
		System.out.println("Name of the Pet-1: " + p1.name);
		System.out.println("Age  of the Pet-1: " + p1.age);
		System.out.println("Loc  of the Pet-1: " + p1.loc);
		System.out.println("Typ  of the Pet-1: " + p1.type);
			
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");	
		System.out.println(" Variables after calling All variable Constructors");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			
		System.out.println("Name of the Pet-2: " + p2.name);
		System.out.println("Age  of the Pet-2: " + p2.age);
		System.out.println("Loc  of the Pet-2: " + p2.loc);
		System.out.println("Typ  of the Pet-2: " + p2.type);
			
			
	}
	



}

