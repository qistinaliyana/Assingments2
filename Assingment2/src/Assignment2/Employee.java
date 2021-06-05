package Assignment2;

import java.util.Scanner;


public class Employee extends SoftwareTraining{ //subclass
        Scanner s = new Scanner (System.in);
	    private String id;
	    private String name;
	    private String department;
	    private int age;
	    private int salary;
	 
	    //constructor with five arguments
	    public Employee(String Company_name, String Contact_Us, String Email, String id, String name, String department, int age, int salary){
	    	super(Company_name, Contact_Us, Email);
	        this.id = id;
	        this.name = name;
	        this.department = department;
	        this.age = age;
	        this.salary = salary;
	    
	      
	 			System.out.println("\nEnter Your Id : ");
	 		    this.id = s.next();
	 		    System.out.println("\nEnter Your Name : ");
	 		    this.name = s.next();
	 		    System.out.println("\nEnter Your Department : ");
	 		    this.department = s.next();
	 		    System.out.println("\nEnter Your Age : ");
	 		    this.age = s.nextInt();
	 		    System.out.println("\nEnter Your Salary : ");
	 		    this.salary = s.nextInt();
	 		
	    }
	   // polymorphism
		 public void printInfo() {
			    System.out.println("\n====================Employer information=====================");    
			    System.out.println(" \n Id : " +this.id);
		        System.out.println(" Name : " + this.name);
			    System.out.println(" Department : " + this.department);
			    System.out.println(" Age : " + this.age);
			    System.out.println(" Salary : " + this.salary);
		        System.out.println("\n===========================End==============================");
			
		 }
		 
	   
	}
