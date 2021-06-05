package Assignment2;

import java.util.Scanner;


public class Advertisement extends SoftwareTraining { //subclass
	 Scanner s = new Scanner(System.in);
    private String Advers;
   
    
    //constructer
     public Advertisement (String Company_name, String Contact_Us, String Email, String Advers){
    	super (Company_name, Contact_Us, Email);
	    this.Advers = Advers;	  
     }
	    
	//method 		
	public void displayCoursedetail() {   
	System.out.println("\n\t\t\t\t======================================");
	System.out.println("\t\t\t\t-------SOFTWARE TRAINING COURSE--------");
	System.out.println("\n\t\t\t\t CLASS     COURSE DURATION     PRICE");
	System.out.println("\t\t\t\t JAVA          3 MONTH          RM 800");
	System.out.println("\t\t\t\t PYTHON        2 MONTH          RM 800");
	System.out.println("\t\t\t\t C++           4 MONTH          RM 800");
	System.out.println("\t\t\t\t======================================");
	System.out.println("\t\t\t\t         Book your Seat Now!");
    }
	
    //getter
	public String getAdvers() {
		return this.Advers;
	}
	
	  // polymorphism
	 public void printInfo() {
		   
		   System.out.println("\n Choose type of advertisement (1.Youtube/2.Instagram/3.Newspaper) : ");
			int num = s.nextInt();
			if (num == 1) {
				System.out.println("\nYoutube name : Intelleq QS");
				System.out.println("Youtube description : This company Intelleq Qs we provides variuos course that interest you such as java, C++ and others. So are you interested in learning about software? just need to contact us now!. ");		
				System.out.println("Website price : Rm 3000");
			} else if (num == 2) {
				System.out.println("Instagram name : Intelleq_QS");
				System.out.println("Instagram description : Welcome to our Instagram! We are open from 8 am until 10 pm! Book Your Seat now!  ");	
				System.out.println("Instragram price : Rm 1000");
			} else if(num == 3) {
				System.out.println("Website name : Intelleq QS");
				System.out.println("Website description : Lest's come to register at Intelleq QS you will not regret it because you will learn from nothing to proficient!. So do register now!  ");
				System.out.println("Website price : Rm 2000");
			}
			
    }
		 
}
