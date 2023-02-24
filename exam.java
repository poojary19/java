package program;
import java.util.Scanner;
class staff{
	String staffid;
	String name;
	long phno;
	double salary;

	void readstaffdetails() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("enter the staffid");
		staffid=userInput.next();
		System.out.println("enter the name");
		name=userInput.next();
		System.out.println("enter the ph");
		phno=userInput.nextLong();
		System.out.println("enter the salary");
		salary=userInput.nextDouble();
	}
	void displaystaffdetails1() {
		System.out.println("enter the staffid"+staffid);
		System.out.println("enter the name"+name);
		System.out.println("enter the ph"+phno);
		System.out.println("enter the salary"+salary);
		
	}
}
class Teaching extends staff{
	String domain;
	int noofpublication;
	void readstaffdetails() {
		super.readstaffdetails();
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("enter the domain");
		domain=userInput.next();
		System.out.println("enter the noofpublication");
		noofpublication=userInput.nextInt();
	}
	void displaystaffdetails1() {
		super.displaystaffdetails1();
		System.out.println("enter the domain"+domain);
		System.out.println("enter the name"+noofpublication);
	}
}
	class technical extends staff{
		String skills[]=new String[5];
		int noofskills;
		void readstaffdetails() {
super.readstaffdetails();
			Scanner userInput = new Scanner(System.in);
			System.out.println("enter the no of skills");
			noofskills=userInput.nextInt();
			System.out.println("enter the skills");
			for(int i=0;i<noofskills;i++) 
				skills[i]=userInput.next();
			}
		
	
		
		void displaystaffdetails() {
			super.displaystaffdetails1();
			System.out.println("enter the skills"+skills);
			for(int i=0;i<noofskills;i++)
			System.out.println(skills[i]);
	}
		}
		class contract extends staff{
			float contractperiod;
			void readstaffdetails() {
				
			super.readstaffdetails();
				Scanner userInput = new Scanner(System.in);
				System.out.println("enter the contract");
				contractperiod=userInput.nextFloat();
		}
			void displaystaffdetails() {
				super.displaystaffdetails1();
				System.out.println("enter the contract"+contractperiod);	
			}
		}
public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Teaching t1=new Teaching();
t1.readstaffdetails();
technical t2=new technical();
t2.readstaffdetails();
contract t3=new contract();
t3.readstaffdetails();
t1.displaystaffdetails1();
t2.displaystaffdetails();
t3.displaystaffdetails();
	}
}
	
	

