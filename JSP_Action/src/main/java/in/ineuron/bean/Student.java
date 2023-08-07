package in.ineuron.bean;

public class Student {

	private int sid;
	private String sname;
	private String saddress;
	private int sage;

	public Student(){
		System.out.println("Student-class file is loading...");
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
		System.out.println("Student.setSid()");
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
		System.out.println("Student.setSname()");
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
		System.out.println("Student.setSaddress()");
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
		System.out.println("Student.setSage()");
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", sage=" + sage + "]";
	}

	
}
