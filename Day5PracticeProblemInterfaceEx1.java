
public class Day5PracticeProblemInterfaceEx1 {

	public static void main(String[] args) {
		FountainPen f1=new FountainPen();
		f1.refil();

	}

}
abstract class Pen{
	abstract void write();
	abstract void refil();
	
}
class FountainPen extends Pen{
	void changenib()
	{
	}
		void write()
		{
			
		}
		void refil()
		{
			System.out.println("refilled");
		}
	}
