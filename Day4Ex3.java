
public class Day4Ex3 {

	public static void main(String[] args) {
		Square s1=new Square();
		s1.shape1();
		s1.shape4();
	}

}
class Shape{
	public void shape1()
	{
		System.out.println("this is shape");
	}
}
class Rectangle extends Shape{
	public void shape2()
	{
		System.out.println("this is rectangle shape");
	}
}
class Circle extends Shape{
	public void shape3()
	{
		System.out.println("this is circular shape");
	}
}
class Square extends Rectangle{
	public void shape4()
	{
		System.out.println("square is a rectangle");
	}
}

