import java.util.*;
class Employee
{
	Scanner obj = new Scanner(System.in);
	int eno;
	String ename;
	double salary;
	void read()
	{
		System.out.println("Enter eno:");
		eno= obj.nextInt();
		System.out.println("Enter name:");
		ename= obj.next();
		System.out.println("Enter salary:");
		salary= obj.nextDouble();
	}
	void display()
	{
		System.out.println("Eno:"+this.eno);
		System.out.println("Ename:"+this.ename);
		System.out.println("Salary:"+this.salary);
	}


	public static void main(String args[])
	{
		int i,flag=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter no.of employees:");
		int n= obj.nextInt();
		Employee[ ] eobj = new Employee[n];
		
		for(i=0;i<n;i++)
		{
			eobj[i] = new Employee();
			eobj[i].read();
		}
		
		System.out.println("Enter eno.to search:");
		int key= obj.nextInt();

		for(i=0;i<n;i++)
		{
			if(eobj[i].eno==key)
			{
				eobj[i].display();
				flag=1;
				break;
			}	
		}
		if(flag!=1)
			System.out.println("Employee not found.");
	}

}
