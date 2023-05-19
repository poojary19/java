package program;

import java.io.File;

public class delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("JavaFile.java");

	    // deletes the file
	    boolean value = file.delete();
	    if(value) {
	      System.out.println("JavaFile.java is successfully deleted.");
	    }
	    else {
	      System.out.println("File doesn't exit");
	    }
	}

}
