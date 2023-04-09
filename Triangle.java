package program;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double a,b,c,perimeter,s,area;
Scanner sc=new Scanner(System.in);
System.out.println("enter the three sides");
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
perimeter=a+b+c;
s=(a+b+c)/2;
area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.format("enete the perimeter %2f", perimeter);
System.out.format("enete the semi %2f",s);
System.out.format("enete the area %2f", area);
	}

}
