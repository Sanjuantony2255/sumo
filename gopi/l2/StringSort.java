import java.util.*;
class StringSort
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter no.of strings:");
		int n = obj.nextInt();
		int i;
		String strings[] = new String[n];
		System.out.println("Enter Strings:-");
		for(i=0;i<n;i++)
		{
			strings[i] = obj.next();
		}
		for(i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(strings[i].compareTo(strings[j])>0)
				{
					String temp=strings[i];
					strings[i]=strings[j];
					strings[j]=temp;
				}
			}
		}

		for(i=0;i<n;i++)
		{
			System.out.println(strings[i]);
		}
		
	}
}
