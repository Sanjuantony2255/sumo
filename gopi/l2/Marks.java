import java.util.*;
class Marks
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		double sum=0;
		System.out.println("Enter no.of marks:");
		int n = obj.nextInt();
		int t=100*n;
		int marks[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter mark out of 100:");
			marks[i] = obj.nextInt();
			sum=sum+marks[i];
		}
		double per= (sum/t)*100; 
		System.out.println("Maximum marks:"+t);
		System.out.println("Total marks:"+sum);
		System.out.println("Percentage:"+per);
		
	}
}
