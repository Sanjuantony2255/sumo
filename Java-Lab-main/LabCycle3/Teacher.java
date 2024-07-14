import java.util.*;
class Employee
{
	Scanner obj = new Scanner(System.in);
	int emp_id;
	String emp_name,emp_address;
	float salary;
	Employee(int id,String name,float sal,String adrs)
	{
		this.emp_id=id;
		this.emp_name=name;
		this.salary=sal;
		this.emp_address=adrs;
	}

	void display()
	{
		System.out.println("Eno:"+this.emp_id);
		System.out.println("Ename:"+this.emp_name);
		System.out.println("Salary:"+this.salary);
	}
}
class Teacher extends Employee
{
	String dept,subject;
	Teacher(int id,String name,String adrs,float sal,String dept,String sub)
	{
		super(id,name,sal,adrs);
		this.dept=dept;
		this.subject=sub;
	}
	void display()
	{	
		super.display();
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
			System.out.println("Enter empid:");
			int emp_id= obj.nextInt();
			System.out.println("Enter name:");
			String emp_name= obj.next();
			System.out.println("Enter adrs:");
			String emp_address= obj.next();
			System.out.println("Enter salary:");
			float salary= obj.nextFloat();	
			System.out.println("Enter dept:");
			String dept= obj.next();
			System.out.println("Enter subject:");
			String subject= obj.next();
			tobj[i] = new Teacher( emp_id, emp_name, emp_address, salary, dept, subject);
		}
		System.out.println("\nDetails:-");
		for(i=0;i<n;i++)
		{
			System.out.println("\nEmployee1:-");
			tobj[i].display();
		}
		
/*		System.out.println("Enter eno.to search:");
		int key= obj.nextInt();

		for(i=0;i<n;i++)
		{
			if(tobj[i].eno==key)
			{
				tobj[i].display();
				flag=1;
				break;
			}	
		}
		if(flag!=1)
			System.out.println("Employee not found.");*/
			
	}

}
