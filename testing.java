class Parent
{
	void print()
	{
		System.out.println("This is parent class");
	}
	
}
class Child extends Parent
{
	void write()
	{
		System.out.println("This is child class");
	}
}


class testing
{
	public static void main(String args[])
	{
		Parent P = new Parent();
		Child C = new Child();
		P.print();//method of parent class by object of parent class
		C.write();//method of child class by object of child class 
		C.print();//method of parent class by object of child class 
	}
}
//output
/*
This is parent class
This is child class
This is parent class
*/