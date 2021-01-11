class Tofind
{
	static int area(int l,int b)
	{
		System.out.println("Area of Rectangle = "+(l*b));
		return 0;
	}
	static int area(int r)
	{
		System.out.println("Area of Circle = "+(3.14*r*r));
		return 0;
	}
}

class MethodOverloading
{
	public static void main(String args[])
	{
		Tofind.area(4,5);
		Tofind.area(6);
	}
}
/*
output

Area of Rectangle = 20
Area of Circle = 113.03999999999999
*/