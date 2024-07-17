import java.util.*;
class SearchArr
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		int i,flag=0;
		System.out.println("Enter limit:");
		int n = obj.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements:-");
		for(i=0;i<n;i++)
		{
			arr[i] = obj.nextInt();
		}
		System.out.println("Enter element to search:");
		int item = obj.nextInt();
		for(i=0;i<n;i++)
		{
			if(arr[i] == item)
			{
				System.out.println("Element is found at position:"+(i+1));
				flag=1;
				break;
			}	
		}
		if(flag!=1)
			System.out.println("Element is not found");
	}
}
