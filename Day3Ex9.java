/*Create a class 'Student' with three data members which are name, age and address. The constructor of the class assigns default values name as "unknown", 
 * age as '0' and address as "not available". It has two members with the same name 'setInfo'. 
 * First method has two parameters for name and age and assigns the same whereas the second method takes has three parameters 
 * which are assigned to name, age and address respectively. Print the name, age and address of 10 students. Hint - Use array of objects */
import java.util.Scanner;
public class Day3Ex9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student [] x=new Student[10];
		for(int i=0;i<x.length;i++)
		{
			x[i]=new Student();
			String name=sc.next();
			int age=sc.nextInt();
			String address=sc.next();
	
			Student s1=new Student();
			s1.setinfo(name,age);
			s1.setinfo(name, age,address);
			s1.print();
		
		}
		
		sc.close();
	}


}
class Student{
	String name;
	int age;
	String address;
	Student()
	{
		this.name="unknown";
		this.age=0;
		this.address="not avialble";
	}
	public void setinfo(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void setinfo(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void print()
	{
		System.out.println(name+age+address);
	}
}
