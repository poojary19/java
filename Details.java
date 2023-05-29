package program;

import java.util.Scanner;

class Staff{
	String Staffid;
	String name;
	long phoneNo;
	double salary;
	void readStaffDetails()
	{
		Scanner userInput=new Scanner(System.in);
		System.out.println("enter the staffid");
		Staffid=userInput.next();
		System.out.println("enter the name");
		name=userInput.next();
		System.out.println("enter the phoneno");
		phoneNo=userInput.nextLong();
		System.out.println("enter the salary");
		salary=userInput.nextDouble();	
	}
	void displayStaffDetails()
	{
		System.out.println("enter the staffid"+Staffid);
		System.out.println("enter the name"+name);
		System.out.println("enter the phoneno"+phoneNo);
		System.out.println("enter the salary"+salary);	
	}
}
class Teaching extends Staff {
	String domain;
	int noOfPublication;
	 void readstaffdetails() {
	System.out.println("------teaching staff details--------");
	super.readStaffDetails();
	Scanner userInput=new Scanner(System.in);
	System.out.println("enter the domain");
	domain=userInput.next();
	System.out.println("enter the noOfPublication");
	noOfPublication=userInput.nextInt();	
    }
	void displayStaffDetails()
	{
		System.out.println("------teaching staff details--------");
	super.displayStaffDetails();
	
	System.out.println(" the domain"+domain);
	System.out.println(" the noOfPublication"+noOfPublication);
	}
}
class Technical extends Staff{
	String skills[]=new String[5];
	int noofskills;
	void readStaffDetails() {
		System.out.println("------technical staff details--------");
		super.readStaffDetails();
		Scanner userInput=new Scanner(System.in);
		System.out.println("enter the no.of skills");
		noofskills=userInput.nextInt();
		System.out.println("enter the skills");
		for(int i=0;i<noofskills;i++)
		{
			skills[i]=userInput.next();
		}
	    }
		void displayStaffDetails()
		{
			System.out.println("------technical staff details--------");
		super.displayStaffDetails();
		
		System.out.println("the skills are");
		for(int i=0;i<noofskills;i++)
		{
			System.out.println(skills[i]);
		}
		}
	}
class Contract extends Staff {
	int contract;
	void readStaffDetails() {
	System.out.println("------contract staff details--------");
	super.readStaffDetails();
	Scanner userInput=new Scanner(System.in);
	System.out.println("enter the contract");
	contract=userInput.nextInt();	
    }
	void displayStaffDetails()
	{
		System.out.println("------contract staff details--------");
	super.displayStaffDetails();
	
	System.out.println(" the contract"+contract);
	}

}

public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teaching t=new Teaching();
		Technical te=new Technical();
		Contract c=new Contract();
		t.readStaffDetails();
		te.readStaffDetails();
		c.readStaffDetails();
		t.displayStaffDetails();
		te.displayStaffDetails();
		c.displayStaffDetails();
	}

}
