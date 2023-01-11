package program;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int a=0,b=0,result;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter the two values");
			a=sc.nextInt();
			b=sc.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("entered value is invalid"+e);
		}
		try {
			result =a/b;
			System.out.println("the result is:"+result);
		} catch(ArithmeticException e) {
			System.out.println("divide by 0 error");
		}
		System.out.println("thank you");
			}

		
	}


