package program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj=new ArrayList<String>();
		Scanner d = new Scanner(System.in);
		int c,ch;
		int i,j;
		String str,str1;
		do {
			System.out.println("1.append at end\n2.insert at particular index\n3.search");
			System.out.println("4.list the string starting with letter");
			System.out.println("5.size\n6.sort\n7.sort\n8.display\n");
			System.out.println("enter your choice");
			c=d.nextInt();
			switch(c)
			{
			case 1:
			{
				System.out.println("enter the string");
			str=d.next();
			obj.add(str);
			break;
			}
			case 2:
			{
				System.out.println("enter the string");
				str=d.next();
				System.out.println("enter the index/position to insert");
				i=d.nextInt();
				obj.add(i-1,str);
				System.out.println("arraylist has the following elements:"+obj);
				break;
			}
			case 3:
			{
				System.out.println("enter the string to search");
				str=d.next();
				j=obj.indexOf(str);
				if(j==-1) {
					System.out.println("element is not found!!!");
				}else {
					System.out.println("indexof"+str+"is"+j);
				}
				break;
			}
			case 4:
			{
				System.out.println("enter the character to list string of the specified character ");
				str =d.next();
				for(i=0;i<(obj.size()-1);i++) {
					str1=obj.get(i);
					if(str1.startsWith(str)) {
					System.out.println(str1);
				}
			}
				break;
			}
			case 5:
			{
				System.out.println("enter the size of the list"+obj.size());
			}
			case 6:
			{
				System.out.println("enter the element to be removed:");
				str=d.next();
				if(obj.remove(str)) {
					System.out.println("element is removed"+str);
				}else {
					System.out.println("element is not present");
				}
				break;
			}
			case 7:
			{
				Collections.sort(obj);
				System.out.println("arraylist has the following element:"+obj);
			}
			case 8:
			{
				System.out.println("arraylist has the following element:"+obj);
			}
			}
			System.out.println("enter 0 to break and 1 to continue");
			ch=d.nextInt();
			
			}while(ch==1);
			}
		}
				
