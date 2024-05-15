
public class Day5PPEx3 {
public static void main(String[]args)
{
	Human h1=new Human();
	h1.eat();
	h1.sleep();
	h1.bite();
	h1.jump();
}
}
interface Animals{
	public void eat();
	public void sleep();
}
 class Monkey{
	public void jump()
	{
		System.out.println("its jumping");
	}
	public void bite()
	{System.out.println("its biting");
		
	}
}
class Human extends Monkey implements Animals {
	public void eat()
	{
		System.out.println("its eating");
	}
	public void sleep()
	{
		System.out.println("its sleeping");
	}
}