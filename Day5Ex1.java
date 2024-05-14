	
public class Day5Ex1 {

	public static void main(String[] args) {
		Subclass1 s1=new Subclass1();
		s1.message();
		Subclass2 s2=new Subclass2();
		s2.message();
		
	}

}
abstract class Parent{
	public  abstract void message();
}
class Subclass1{
	public void message()
	{
		System.out.println("first sub class");
	}
}
class Subclass2{
	public void message()
	{
		System.out.println("second sub class");
	}
}
