
public class DAy4Ex2 {

	public static void main(String[] args) {
	Employee E1=new Employee("dhruv",19,856152678,"hyd",400000,"cse","btech");
	Manager M1=new Manager("tej",17,856152178,"hyd",200000,"ese","btech");
	E1.printsalary();
	M1.printsalary();
	}

}
class Member{
	String name;
	int age;
	long phoneno;
	String address;
	double Salary;
	Member(String name,int age,long phoneno,String address,double Salary)
	{this.name=name;
	this.age=age;
	this.phoneno=phoneno;
	this.address=address;
	this.Salary=Salary;
		
	}
	public void printsalary()
	{
		System.out.println("the salary is"+Salary);
	}
	
}
class Employee extends Member{
	String specalization,dept;
	String name;
	int age;
	long phoneno;
	String address;
	double Salary;
	
	Employee(String name,int age,long phoneno,String address,double Salary,String specalization,String dept)
	{super(name,age,phoneno,address,Salary);
		this.specalization=specalization;
		this.dept=dept;
		System.out.println(specalization+dept);
	}
	
}
class Manager extends Member{
	String name;
	int age;
	long phoneno;
	String address;
	double Salary;
	String specalization,dept;
	Manager(String name,int age,long phoneno,String address,double Salary ,String specalization,String dept)
	{
		super(name,age,phoneno,address,Salary);
		this.specalization=specalization;
		this.dept=dept;
		System.out.println(specalization+dept);
	}

}
