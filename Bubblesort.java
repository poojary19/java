package program;

import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,i,j,temp;
Scanner input=new Scanner(System.in);
System.out.println("enter the no of integer to sort:");
num=input.nextInt();
int array[]=new int[num];
System.out.println("enter"+num+"integer:");
for(i=0;i<num;i++)
	array[i]=input.nextInt();
for(i=0;i<(num-1);i++) {
	for(j=0;j<num-i-1;j++) {
		if(array[j]>array[j+1]) {
			temp=array[j];
			array[j]=array[j+1];
			array[j+1]=temp;
		
		}
	}
}
System.out.println("sorted list of integers:");
for(i=0;i<num;i++) {
	System.out.println(array[i]);
	}

	}
}
