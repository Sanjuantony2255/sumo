import java.util.*;
class Publisher
{
	String pub_name;
}
class Book extends Publisher
{
	String book_name,author;
	float price;
}
class Fiction extends Book
{
	Scanner obj=new Scanner(System.in);
	void read2()
	{	
		System.out.println("Enter pub name:" );
		this.pub_name=obj.next();
		System.out.println("Enter book name:");
		this.book_name=obj.next();
		System.out.println("Enter author name:");
		this.author=obj.next();		
		System.out.println("Enter price:");
		this.price=obj.nextFloat();
	}
	void display2()
	{
		System.out.println("Publisher name:"+this.pub_name);
		System.out.println("Book name:"+this.book_name);
		System.out.println("Author:"+this.author);
		System.out.println("Price:"+this.price);
	}
}
class Literature extends Book
{
	Scanner obj=new Scanner(System.in);
	void read1()
	{	
		System.out.println("Enter pub name:" );
		this.pub_name=obj.next();
		System.out.println("Enter book name:");
		this.book_name=obj.next();
		System.out.println("Enter author name:");
		this.author=obj.next();		
		System.out.println("Enter price:");
		this.price=obj.nextFloat();
	}
	void display1()
	{
		System.out.println("Publisher name:"+this.pub_name);
		System.out.println("Book name:"+this.book_name);
		System.out.println("Author:"+this.author);
		System.out.println("Price:"+this.price);
	}	
	public static void main(String args[])
	{
		int i,flag=0;
		System.out.println("Literature:-");
		Literature lit = new Literature();
		lit.read1();
		System.out.println("Details:-");
		lit.display1();
		System.out.println("\nFiction:-");
		Fiction fic = new Fiction();
		fic.read2();
		System.out.println("Details:-");
		fic.display2();
			
	}

}
