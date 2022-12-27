package program;

import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean isprime = true;
Scanner UserInput = new Scanner(System.in);
int num = UserInput.nextInt();
for(int i=2;i<=num/2;i++) {
	if(num%i==0)
	isprime = false;
	break;
}
		
	if(isprime)
System.out.println(num+"is a prime no");
	else
		System.out.println(num+"is a not a prime no");
	}
}


