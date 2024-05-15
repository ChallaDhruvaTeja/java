
public class Day5Ex4 {

	public static void main(String[] args) {
		S_class s=new S_class();
		s.a_method();
		s.normalmethod();
	}

}
abstract class Constructor{
	 Constructor()
	{
		System.out.println("this is a constructor of abstract class"); 
	}
	abstract void a_method();
	public void normalmethod()
	{
		System.out.println("this is a normal method of abstract class"); 
	}
	
}
class S_class extends Constructor{
	void a_method()
	{
		System.out.println("this is abstract method"); 
	}
}
