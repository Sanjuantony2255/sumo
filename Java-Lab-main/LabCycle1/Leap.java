import java.util.*;
class Leap
{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		int start,end;
		System.out.println("Enter start year:");
		start= obj.nextInt();
		System.out.println("Enter end year:");	
		end= obj.nextInt();	
		System.out.println("Leap years:-");		
		for(int i=start;i<=end;i++){
			if(i%400==0 || (i%4==0 && i%100!=0))
			{
				System.out.println(i);
			}	
		}
	}
}
