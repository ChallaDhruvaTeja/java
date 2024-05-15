
public class Day5Ex3 {
public static void main(String[]args)
{
	A a1=new A(75,87,91);
	B b2=new B(88,89,95,99);
	System.out.println(a1.getpercentage());
	System.out.println(b2.getpercentage());
}
}
abstract class Marks{
	public abstract float getpercentage();
	
		
	
}
class A extends Marks{
	float m1,m2,m3;
	A(float marks1,float marks2,float marks3)
	{m1=marks1;
	m2=marks2;
	m3=marks3;
		
	}
	public float getpercentage()
	{
		float percentage=((m1+m2+m3)/300)*100;
		return percentage;
	}
}
class B extends Marks{
	float m1,m2,m3,m4;
	B(float marks1,float marks2,float marks3,float marks4)
	{m1=marks1;
	m2=marks2;
	m3=marks3;
	m4=marks4;
		
	}
	public float getpercentage()
	{
		float percentage=((m1+m2+m3+m4)/400)*100;
		return percentage;
	}
}
