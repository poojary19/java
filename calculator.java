package program;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double result;
Scanner Userinput = new Scanner(System.in);
System.out.println("choose the operator number"
		+ "\n1.+"
		+ "\n2.-"
		+ "\n3.*"
		+ "\n4./" );
int operator = Userinput.nextInt();
System.out.println("enter the first no");
double num1 = Userinput.nextDouble();
System.out.println("enter the second no");
double num2 = Userinput.nextDouble();
switch(operator)
{
case 1:
	result = num1+num2;
	System.out.println("the sum of"+num1+"and"+num2+"is"+result);
	break;
case 2:
	result =num1-num2;
	System.out.println("the sum of"+num1+"and"+num2+"is"+result);
	break;
case 3:
	result = num1*num2;
	System.out.println("the sum of"+num1+"and"+num2+"is"+result);
	break;
case 4:
	result = num1/num2;
	System.out.println("the sum of"+num1+"and"+num2+"is"+result);
	break;
	default:
		System.out.println("invalid choice");
		break;
	
	
	
}

	}

}
