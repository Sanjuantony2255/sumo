import java.util.*;
class Person
{
	String pname,gender,address;
	int age;
	Person(String name,String gender,int age,String address)
	{
		this.pname=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}
	void display()
	{
		System.out.println("Name:"+this.pname);
		System.out.println("Gender:"+this.gender);
		System.out.println("Address:"+this.address);
		System.out.println("Age:"+this.age);
	}
}
class Employee extends Person
{
	Scanner obj = new Scanner(System.in);
	int emp_id;
	String cp_name,qualification;
	float salary;
	Employee(String name,String gender,int age,String address,int empid,String cp,float sal,String qualif)
	{
		super(name,gender,age,address);
		this.emp_id=empid;
		this.cp_name=cp;
		this.qualification=qualif;
		this.salary=sal;
	}

	void display()
	{
		super.display();
		System.out.println("Empid:"+this.emp_id);
		System.out.println("CompanyName:"+this.cp_name);
		System.out.println("Qualification:"+this.qualification);
		System.out.println("Salary:"+this.salary);
	}
}
class Teacher extends Employee
{
	int teach_id;
	String dept,subject;
	Teacher(String name,String gender,int age,String address,int empid,String cp,float sal,String qualif,int tid,String dept,String subject)
	{
		super(name,gender,age,address,empid,cp,sal,qualif);
		this.teach_id=tid;
		this.dept=dept;
		this.subject=subject;
	}
	void display()
	{	
		super.display();
		System.out.println("TiD:"+this.teach_id);
		System.out.println("Dept:"+this.dept);
		System.out.println("Subject:"+this.subject);
	}	
	public static void main(String args[])
	{
		int i,flag=0;
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter no.of employees:");
		int n= obj.nextInt();
		Teacher[ ] tobj = new Teacher[n];
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter name:");
			String name= obj.next();
			System.out.println("Enter gender:");
			String gendr= obj.next();
			System.out.println("Enter age:");
			int age= obj.nextInt();
			System.out.println("Enter adrs:");
			String address= obj.next();
		
			System.out.println("Enter empid:");
			int empid= obj.nextInt();
			System.out.println("Enter company name:");
			String cp= obj.next();
			System.out.println("Enter salary:");
			float sal= obj.nextFloat();	
			System.out.println("Enter qualification:");
			String qualif= obj.next();
			
			System.out.println("Enter Teacher id:");
			int tid= obj.nextInt();
			System.out.println("Enter dept:");
			String dept= obj.next();
			System.out.println("Enter subject:");
			String subject= obj.next();
			tobj[i] = new Teacher(name,gendr,age,address,empid,cp,sal,qualif,tid,dept,subject);
		}
		System.out.println("\nDetails:-");
		for(i=0;i<n;i++)
		{
			System.out.println("\nEmployee1:-");
			tobj[i].display();
		}
			
	}

}
