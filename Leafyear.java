package program;

import java.util.Scanner;

public class Leafyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year;
System.out.println("enter the year");
Scanner sc=new Scanner(System.in);

year=sc.nextInt();
if(((year%4==0)&&(year%100!=0))||(year%400==0)) 
System.out.println("it is leap year");

else 
	System.out.println("it is not leapyear");
	

}
				
			
		
		}
	


	


