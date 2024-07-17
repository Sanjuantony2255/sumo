import java.util.*;
class Product
{
	int pcode,price;
	String pname;
	Scanner obj = new Scanner(System.in);
	Scanner obj2 = new Scanner(System.in);
	void setdata()
	{
		System.out.println("Enter product code:");
		pcode=obj.nextInt();
		System.out.println("Enter product name:");
		pname=obj2.nextLine();
		System.out.println("Enter product price:");
		price=obj.nextInt();
	}
	public static void main(String args[])
	{
		Product pdt1 = new Product();
		Product pdt2 = new Product();
		Product pdt3 = new Product();
		pdt1.setdata();
		pdt2.setdata();
		pdt3.setdata();

		if ((pdt1.price<pdt2.price)&& (pdt1.price<pdt3.price))
			System.out.println("Product 1 has lowest price");
		else if(pdt2.price<pdt3.price)
			System.out.println("Product 2 has lowest price");
		else
			System.out.println("Product 3 has lowest price");
	}
}
