import java.util.*;
class Complex
{
	int r,i;
	public Complex(int real,int img)
	{
		this.r=real;
		this.i=img;
	}
	void add(Complex other)
	{
		this.r=this.r+other.r;
		this.i=this.i+other.i;
		System.out.println("Sum="+this.r+"+i"+this.i);
	}
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		int r1,i1,r2,i2;
		System.out.println("Enter real part of first number:");
		r1= obj.nextInt();
		System.out.println("Enter imaginary part of first number:");
		i1= obj.nextInt();
		Complex c1=new Complex(r1,i1);

		System.out.println("Enter real part of second number:");
		r2= obj.nextInt();
		System.out.println("Enter imaginary part of second number:");
		i2= obj.nextInt();
		Complex c2=new Complex(r2,i2);

		c2.add(c1);
	}
}