package abstractdemo;

public  class Teacher implements Resume {
	String name;
	String staffid;
	String designation;
	long phoneno;
	String qualification;
	double experience;
	public Teacher(String n,String sid,String d, long p,String q,double e) {
	this.name=n;
	this.staffid=sid;
	this.designation=d;
	this.phoneno=p;
	this.qualification=q;
	this.experience=e;
	}

	@Override
	public void biodata() {
		System.out.println("the name of the staff:"+this.name);
		System.out.println("the id of the staff is:"+this.staffid);
		System.out.println("the designation of the staff is:"+this.designation);
		System.out.println("the phone no of the staff is:"+this.phoneno);
		System.out.println("the qualification of the staff is:"+this.qualification);
		System.out.println("the experience of the staff is:"+this.experience);
		// TODO Auto-generated method stub
		
	}
	}