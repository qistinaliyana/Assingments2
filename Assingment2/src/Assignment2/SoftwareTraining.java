package Assignment2;
import java.util.Scanner;

public abstract class SoftwareTraining {  //Abstract class
	Scanner s = new Scanner(System.in) ; 
	protected String Contact_Us;
	protected String Company_name;
	protected String Email;
	protected String location;
	private String languages, topic;
	
	
	 public SoftwareTraining ( String Company_name, String Contact_Us, String Email) {
		this.Company_name = Company_name ;
		this.Contact_Us = Contact_Us;
		this.Email = Email; 
	   }	
  
	 //method
	public void printlanguages(String lang, String tcover) {
	      this.languages = lang; 
	      this.topic = tcover;
	      System.out.println("\n+++Course Details+++");
	      System.out.println(this.languages + " Programming Language");
	      System.out.println(this.topic + " Programming Language");
	      
    }
   // polymorphism and Abstract method
	  public abstract void printInfo();
	 	 
   }