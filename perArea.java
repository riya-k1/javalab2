class Triangle
{
	Triangle()
	{
		int H=4;int B=3;int S =5;
		System.out.println("Perimeter of triangle with sides"+H+" , "+B+" , "+S+" = "+(H+B+S));
		System.out.println("Area of triangle with sides"+H+" , "+B+" , "+S+" = "+(0.5*B*H));
		
	}


}
class perArea
{
	public static void main(String args[])
	{
	Triangle obj = new Triangle();
    }
}
/*
oUTPUT

Perimeter of triangle with sides4 , 3 , 5 = 12
Area of triangle with sides4 , 3 , 5 = 6.0
*/