
public class Ex6and7Day5PP {
public static void main(String[]args) {
	Tv t=new Tv();
	t.onnormally();
	t.onwithohone();
}
}
interface Tvremote{
	public void onnormally();
}
interface SmartTvremote extends Tvremote{
	public void onwithohone();
	
}
class Tv implements SmartTvremote{
	public void onnormally()
	{
		System.out.println("oned with remote");
	}
	public void onwithohone()
	{
		System.out.println("oned with smartremote");
	}
}
