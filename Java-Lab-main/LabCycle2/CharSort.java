import java.util.*;
class CharSort
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = obj.next();
		char chararr[]= str.toCharArray();
		Arrays.sort(chararr);
		String newstr= "";
		newstr= newstr.valueOf(chararr);
		System.out.println("String:"+str);
		System.out.println("Sorted:"+newstr);
	}
}
