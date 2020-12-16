package edu.umb.cs680.hw04;


public class Student
{
	protected String name;
	protected float tuition;
	protected String usAddr;
	protected int yrsInState;
	protected int i20num;
	protected String foreignAddr;
	protected enum StudentStatus { INSTATE, OUTSTATE, INTL };
	protected StudentStatus status;
	
	private Student(String name, float tuition, String usAddr, int yrsInState,
			int i20num, String foreignAddr, StudentStatus status)	{
		
		this.name = name;
		this.tuition = tuition;
		this.usAddr = usAddr;
		this.yrsInState = yrsInState;
		this.i20num = i20num;
		this.foreignAddr = foreignAddr;
		this.status = status;
	}
	
	public static Student createInStateStudent(String name, String usAddr)	{
		return new Student(name, (float) 15000, usAddr, 0, 0, "", StudentStatus.INSTATE);
	}
	
	public static Student createOutStateStudent(String name, String usAddr, int yrsInState)	{
		return new Student(name, (float) 30000, usAddr, yrsInState, 0, "", StudentStatus.OUTSTATE);
	}
	
	public static Student createIntlStudent(String name, String usAddr, int i20num, String foreignAddr) {
		return new Student(name, (float) 40000, usAddr, 0, i20num, foreignAddr, StudentStatus.INTL);
	}
	
	public float getTuition()	{
		return this.tuition;
	}
	
	public String getName()	{
		return this.name;
	}
	
	public StudentStatus getStatus()	{
		return this.status;
	}
	
	public static void main(String[] args)
	{
		Student s1 = Student.createInStateStudent("Cole", "10 Chauncy Street");
		Student s2 = Student.createOutStateStudent("Chole", "000 Chauncy Circle", 10);
		Student s3 = Student.createIntlStudent("Coley", "3 Vue de Chaunce", 123456, "-19 Pluto Street");
		System.out.println(s1.getName());
		System.out.println(s2.getTuition());
		System.out.println(s3.getStatus());
	}
}

