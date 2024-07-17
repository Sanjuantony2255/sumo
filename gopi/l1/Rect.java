import java.util.*;
class Rectangle
{
	Scanner obj = new Scanner(System.in);
	float l,b;
	void setData(){
		System.out.println("Enter length:");
		l= obj.nextFloat();
		System.out.println("Enter breadth:");
		b= obj.nextFloat();	
	}
	void getArea(){		
		System.out.println("Area is="+(l*b));
	}
	
}
class Rect
{
public static void main(String args[])
{	
	Rectangle obj2 = new Rectangle();
	obj2.setData();
	obj2.getArea();
}

}

