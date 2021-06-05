package Assignment2;

import java.util.Scanner;


public class MainSt {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 
	    System.out.println("Enter (1)USER or (2)ADMIN :");
	    int Number = s.nextInt();
		if (Number == 1) {
			
		SoftwareTraining st = new Advertisement ("Intelllect QS", "783478249", "IntellectQS@gmail.com", "\n\t\t\t\t\tBest Training Centers in Gombak\r\n"
				+ "	\n\t\t\tThose candidates who wish to enroll and attend the Training programe,r\n"
				+ "	\n\t\tPlease Communicate with us Call 7676765421 , 080-42108236 , 080-42024661 and Book your Seat Now!\r\n"
				+ "	\n\tWe Provide PYTHON, JAVA, C/C++ Certification Training Courses with Placement Support till you get Job !");
		System.out.println(st);
		System.out.println("\n============WELCOME TO THE SOFTWARE TRAINING============");
		st.printlanguages("\nJAVA", "\nCore Java\r\n"
				+ "Advanced Java\r\n"
				+ "Web Services\r\n"
				+ "Android Development\r\n"
				+ "html5, eclipse, oracle, mysql\r\n"
				+ "Java Scripts, Jquery\r\n"
				+ "Web Application development");
		
		st.printlanguages("\nPython", "\nFundamentals of Python\r\n"
				+ "Working with Data\r\n"
				+ "Python Date & Time\r\n" 
				+ "Python Advanced Topics\r\n"
				+ "Python Object & Class\r\n"
				+ "Python Files\r\n" 
				+ "Python Datatypes");
		
		st.printlanguages("\nC++", "\nIntroduction to C++\r\n" 
		        + "Data Types and Variables\r\n" 
				+ "Input/Output Management\r\n" 
		        + "Control-Flow Statements\r\n"
				+ "Control-Flow Statements\r\n" 
		        + "Arrays, Pointers, and Strings\r\n" 
				+ "Structures");
		//st.printInfo();
		
		
		 Advertisement a = new Advertisement ("Intelllect QS", "783478249", "IntellectQS@gmail.com", "\n\n\t\t\t\t\tBest Training Centers in Gombak\r"
			+ "\n\t\t\tThose candidates who wish to enroll and attend the Training programe,"
			+ "\n\t\tPlease Communicate with us Call 7676765421 , 080-42108236 , 080-42024661 and Book your Seat Now!\r\n"
			+ "\tWe Provide PYTHON, JAVA, C/C++ Certification Training Courses with Placement Support till you get Job !"); 
		 System.out.println(a.getAdvers());
		 a.displayCoursedetail();
			
	    
	    Sales p = new Customer ();
	    System.out.println(p);
	    p.printInfo();
	    p.printregister();
	    p.getpayment();
	    
	       
	    
		} else if (Number == 2) {
	    
         Sales t = new Finance () ;
         t.printInfo();
		 t.printbestandworstSales();
		 System.out.println("\n============================End============================");  
		 System.out.println();
		
			
	     SoftwareTraining a1 = new Advertisement("Intelllect QS", "783478249", "IntellectQS@gmail.com", "\n\n\t\t\t\t\tBest Training Centers in Gombak\r"
					+ "\n\t\t\tThose candidates who wish to enroll and attend the Training programe,"
					+ "\n\t\tPlease Communicate with us Call 7676765421 , 080-42108236 , 080-42024661 and Book your Seat Now!\r\n"
					+ "\tWe Provide PYTHON, JAVA, C/C++ Certification Training Courses with Placement Support till you get Job !");
	    System.out.println("\n=========================Advertisement=======================");
	    a1.printInfo();
	    System.out.println("===============================End=============================");
	    
	   	    
	    SoftwareTraining e = new Employee ("Intelllect QS", "783478249", "IntellectQS@gmail.com", null, null, null, 0, 0);		 
        e.printInfo();
        
		}			   
	} 
			  
}

