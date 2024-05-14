
public class DAy4Ex1 {

	public static void main(String[] args) {
		Students s1=new Students();
		Students s2=new Students();
		s1.student();
		s2.student("dhruva");
	}

}
class Students{
	public void student()
	{
		System.out.println("unkniown");
	}
	public void student(String name)
	{ String name1;
		name1=name;
		System.out.println(name1);
	}
}