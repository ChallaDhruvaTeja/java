
public class Day5Ex5 {

	public static void main(String[] args) {
		Cat c1=new Cat();
		c1.cat();
		Dog d1=new Dog();
		d1.dog();

	}

}
abstract class Animal{
 abstract void cat();
abstract void dog();		
}
class Cat extends Animal{
	public void cat()
	{
		System.out.println("meows");
	}
	public void dog()
	{
		
	}
	
}
class Dog extends Animal{
	public void dog()
	{
		System.out.println("Bow bow");
	}
	public void cat()
	{
		
	}
}
