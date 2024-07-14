import java.util.*;
abstract class Shape 
{
	Scanner obj=new Scanner(System.in);
    public abstract void area();
}

class Circle extends Shape 
{
    public void area() 
    {
	System.out.println("Enter radius of circle:");
	double r= obj.nextDouble();		
	double a= 3.14*r*r;
	System.out.println("Area of circle:"+a);
    }
}

class Rectangle extends Shape 
{
    public void area() 
    {
		System.out.println("Enter length&breadth of rectangle:");
		int l= obj.nextInt();
		int b= obj.nextInt();
		int a= l*b;
		System.out.println("Area of rectangle:"+a);
    }

}

class Square extends Shape 
{
    public void area() 
    {
		System.out.println("Enter length of square:");
		int s= obj.nextInt();
		int a= s*s;
		System.out.println("Area of square:"+a);
    }

}
// You can add more shape subclasses like Triangle, Square, etc.

public class AbstractShape 
{
    public static void main(String[] args) 
    {
		Rectangle rect=new Rectangle();
		Circle circ=new Circle();
		Square sq=new Square();
		rect.area();
		circ.area();
		sq.area();
    }
}

