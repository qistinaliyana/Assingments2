package Assignment2;
import java.util.Scanner;

public class Customer extends Sales implements payment { //Subclass
	Scanner s = new Scanner(System.in) ; 
	
	  private String Name; 
	  private String no_hp;
	  private String email;
	  private String mode;
	  private String course;
	

	// constructer 	
	public Customer (){
		super ();
		        this.Name = Name;
		        this.no_hp = no_hp;
		        this.email = email;
		        this.mode = mode;
		        this.course = course;
		        
		        
		        System.out.println("\n=========================Customer========================");
		        
			    System.out.println("\nEnter Your Name : " );
			    this.Name = s.next();
			    System.out.println("Enter Your Mobile No. : " );
			    this.no_hp = s.next();
			    System.out.println("Enter Your Email : " );
			    this.email = s.next();
			    System.out.println("Enter your training mode either classroom or online : " );
			    this.mode = s.next();
			    System.out.println("Enter the Training course you want : " );
			    this.course = s.next();
		        
	            }
	
			
		  // polymorphism

		public void printInfo() {
			System.out.println("\n=========================Receipt============================");
		    System.out.println("\nEnter Your Name : " + this.Name);
		    System.out.println("Enter Your Mobile No. : " + this.no_hp);
		    System.out.println("Enter Your Email : " + this.email);
		    System.out.println("Enter your training mode either classroom or online : " + this.mode);
		    System.out.println("Enter the Training course you want : " + this.course);
		    System.out.println("\n============================End=============================");
			 System.out.println("\n\t\t\t\t\t----------Customer Methodology---------"
		             	+ "\n\t\t\t\t Advertisement + Register + get details course + Attend class = get customer!");
			
		}

		

		      

}
