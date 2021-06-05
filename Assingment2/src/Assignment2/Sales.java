package Assignment2;

import java.util.Scanner;

public abstract class Sales implements payment{ //abstract class 
        Scanner s = new Scanner(System.in);
        
        private double price;
        private int person;
        private double payment;
       
      public Sales (){ 
        	super();       	 
            
        	 this.price = price;
        	 this.person = person;
       }
 
      public void printregister() {	
	  
        System.out.println("\n======================Sales=====================");        
       
        System.out.println("Enter the price course? : RM"); 
        this.price = s.nextInt();
        System.out.println("Enter the amount students register the course available: "); 
        this.person = s.nextInt();
		
         //overloading	    
        if (this.person < 10) {
            totalprice(); //overloading with no arguments
            System.out.println("\nStudent register.");
            System.out.println("If students less than 10, the Total price: RM" + totalprice());
        
        }
            else if (this.person> 10 && this.person< 50) {
            double pp = 80.0;
            totalprice(pp); //overloading with 1 argument
            System.out.println("\nStudent register.");
            System.out.println("If students more than 10, Total price: RM" + totalprice(pp));
        }
        
            else {
            double pr = 10.0;
            int ps  = 50; 
            totalprice(ps, pr); //overloading with 2 arguments
            System.out.println("\nStudent register.");
            System.out.println("If students more than 50, Total price: RM" + totalprice(pr, ps));
            
            }
      }
		public double totalprice() {
        	return this.price * this.person;
        }
        public double totalprice(double pr) {
        	return pr * this.person;
        }
        public double totalprice(double pr, double ps) {
        	return pr * ps;
        }
        
        
 public void  printbestandworstSales () {
        	
        int bestcourseseller = 0, worstcourseseller = 0; 
        int sum =0;
        System.out.println("\n==============================Total Sales============================");
        System.out.println("\nEnter the number of available training courses : "); 
        int salesc = s.nextInt();
   
    	  
        int[] sales = new int[salesc];
        for (int i=0; i < sales.length; i++) {
      
        System.out.print("Enter sales for course training " + i + " : ");
        sales[i] = s.nextInt();
        }
        System.out.println("\n-----------------------------Sales----------------------------------");
 
        for (int i1=0; i1 < sales.length; i1++)  {
 
         //Finding best and worst sales:  
         if(sales[i1] > sales[ (int) bestcourseseller]) {
             bestcourseseller = i1;
            }
             
            if(sales[i1] < sales[ (int) worstcourseseller]) {
                worstcourseseller = i1;
             }
                
            System.out.println("\t " + i1 + "\t\t\t" + sales[i1]);
            sum += sales[i1];
           }
      
		   System.out.println("\nTotal sales: " + sum);
        
           //Print best and worst sales:
           System.out.println("The Best course Seller " + bestcourseseller + " sold the most: " + sales[(int) bestcourseseller]);
           System.out.println("The worst course Seller " + worstcourseseller + " sold the least: " + sales[(int) worstcourseseller]);
        }
        
       
        
        // polymorphism
   	 public void printInfo() {
   		 System.out.println("\n\t\t\t\t\t---------------- sales methodology-----------------"
   	             	+ "\n\t\t\t\t Attract + Making contact + Student register + Feedback good = Sales target!");
   	 }
   	 
   	 
	public void getpayment() {
		      System.out.println("\n========================Payment========================");
			  System.out.println("\nEnter Your payment : RM");
			  this.payment = s.nextDouble();
			  if (this.payment < this.price*this.person ) {
				  System.out.println("\nYour payment: RM " + this.payment);
				  System.out.println("Not enough money, please enter again your payment: RM ");
				  double rm = s.nextDouble();		  
				  System.out.println("Your payment balance: RM " + (rm - this.price*this.person));
		   } else if (this.payment > this.price*this.person) {
			      System.out.println("\nYour payment: RM " + this.payment);
				  System.out.println("Your payment balance: RM " + (this.payment-this.price*this.person));	  
		   } else if (this.payment == this.price*this.person) {  
				  System.out.println("\nYour payment balance: RM " + this.payment);		  
		  } else {
			  System.out.println("Cancel payment");
		  }
			  System.out.println("\n========================Payment========================");
	}
}
