package program;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.io.Writer;
import java.util.Scanner;

public class Fileinfo {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
String Filename=null;
Scanner br=new Scanner(System.in);
System.out.println("enter the name of the string ");
Filename=br.next();
String path="C:\\Users\\lekha\\eclipse-4JK21CS029\\program\\src";
File fcreate=new File(path+"/"+Filename);
try {
	if(fcreate.createNewFile()) {
		System.out.println("the file"+fcreate.getName()+"succesfully created");
		FileWriter Writer=new FileWriter(fcreate);
		Writer.write("files in java seriously good !!!");
	
	Writer.close();
	System.out.println("succesfully written");
}
else
{
	System.out.println("the file"+fcreate.getName()+"already exists");
	}
}catch(IOException e) {
	e.printStackTrace();
}
if(fcreate.exists()) {
	System.out.println("the file readable:"+fcreate.canRead());
	System.out.println("the file writable"+fcreate.canExecute());
	System.out.println("the parent of the file"+fcreate.getAbsolutePath());
	System.out.println("the file hidden"+fcreate.isHidden());
	System.out.println("the wasvmodified"+fcreate.lastModified());
	System.out.println("the length of the file"+fcreate.length());
	fcreate.delete();
	System.out.println("the file"+fcreate.getName()+"is succesfully deleted");
}
	}
}
	

	
	


