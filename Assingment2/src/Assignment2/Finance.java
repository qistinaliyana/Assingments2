package Assignment2;

import java.util.Scanner;

public class Finance extends Sales {// subclass
	
	   Scanner s= new Scanner(System.in);
	 
	   private double costprice,sellprice;	
	    
	     //Constructer
	    public Finance(){
	    	super();
	    	this.sellprice = sellprice;
	    	this.costprice = costprice;
	    	
	    	
	    System.out.println("\n===================Finance==================");			
	    System.out.println("Enter the Costprice: ");
	    this.costprice=s.nextDouble();
	    System.out.println("Enter the Selling price: ");
	    this.sellprice=s.nextDouble();
	    }

	
	  // polymorphism
		 public void printInfo() {	
			 if(this.costprice-this.sellprice > 0 )  {
			      System.out.println("Loss: RM " +(this.costprice-this.sellprice));
			      System.out.println("\n====================End===================");
					}
			   else if(this.costprice-this.sellprice<0) {
				    System.out.println("Profit: RM " +(this.sellprice-this.costprice));
				    System.out.println("\n===================End===================");
					}
					else {
					  System.out.println("NEUTRAL");
			          System.out.println("\n================Thank You================");
					}
		 }
		 
		 //getter method
		    public double getcostprice() {
				return this.costprice;
			}
			public double getsellprice() {
				return this.sellprice;
			}		 
}
