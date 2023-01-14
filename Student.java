package abstractdemo;

public class Student implements Resume {
String name;
String usn;
long phno;
double result;
String discipline;
Student(String name,String usn,long phno,double result,String discipline ){
	this.name=name;
	this.usn=usn;
	this.phno=phno;
	this.result=result;
	this.discipline=discipline;
}
	@Override
	public void biodata() {
		// TODO Auto-generated method stub
		System.out.println("enter the name of the student"+this.name);
		System.out.println("enter the usn of the student"+this.usn);
		System.out.println("enter the phno of the student"+this.phno);
		System.out.println("enter the discipline of the student"+this.discipline);
		System.out.println("enter the result of the student"+this.result);
	}

}
