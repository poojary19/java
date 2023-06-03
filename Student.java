package program;

import java.util.Scanner;

public class Student {

	
		String usn;
		String name;
		String branch;
		long phoneno;
		Student (String u,String n,String b,long ph){
			usn=u;
			name=n;
			branch=b;
			phoneno=ph;
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		String u;
		String n;
		String b;
		long ph;
		System.out.println("enter the no of student");
		Scanner userInput=new Scanner (System.in);
		int studentno=userInput.nextInt();
		Student s[]=new Student[5];
		for(int i=0;i<studentno;i++) {
			System.out.println("enter the usn"+(i+1));
			u=userInput.next();
			System.out.println("enter the name"+(i+1));
			n=userInput.next();
			System.out.println("enter the branch"+(i+1));
			b=userInput.next();
			System.out.println("enter the ph"+(i+1));
			ph=userInput.nextLong();
			s[i]=new Student(u,n,b,ph);
		}
		System.out.println("student details");
		System.out.println("usn\t\t+ namer\t\t+ branch\t\t+phoneno");
		for(int i=0;i<studentno;i++) {
			System.out.println(s[i].usn+"\t\t"+s[i].name+"\t\t"+s[i].branch+"\t\t"+s[i].phoneno);
		}
			
		

	}

}
