
public class Day10Ex10 {

	public static void main(String[] args) {
		Degree d1=new Degree();
		d1.getdegree();
		UG d2=new UG();
		d2.getdegree();
		PG d3=new PG();
		d3.getdegree();

	}

}
class Degree{
	public void getdegree()
	{
		System.out.println("i got a degree");
	}
}
class UG extends Degree{
	public void getdegree()
	{
		System.out.println("i got ug degree");
	}
}
class PG extends Degree{
	public void getdegree()
	{
		System.out.println("i got pg degree");
	}
}
