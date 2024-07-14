import java.util.*;
class StringManip
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter String 1:-");
		String str1= obj.next();
		System.out.println("Enter String 2:-");
		String str2= obj.next();
		System.out.println("Concatenated strings:"+ str1.concat(str2));
		System.out.println("Length of string1:"+ str1.length());	
		System.out.println("Uppercase string1:"+ str1.toUpperCase());
		System.out.println("Replaced string1:"+ str1.replace('e','a'));			
		char chararr[]=str1.toCharArray();		
		System.out.println("Index of lo in string:"+ str1.indexOf("lo"));
		
		StringBuffer strbfr= new StringBuffer("hello");
		StringBuffer temp1= new StringBuffer("hai");
		System.out.println(strbfr.append(temp1));
		
		System.out.println(strbfr.length());
		System.out.println(strbfr.insert(3,temp1));
	}
}
