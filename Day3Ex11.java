import java.util.Scanner;
public class Day3Ex11 {

	public static void main(String[] args) {
		int marks;
		Scanner sc=new Scanner(System.in);
		{
			marks=sc.nextInt();
		}
		sc.close();
		Grade g1=new Grade();
		g1.displaygrades(marks);
	}

}
class Grade{
	public void displaygrades(int marks)
	{
		
		if (marks>90&&marks<=100)
		{
			System.out.println("AA");
		}
		else if(marks>80&&marks<=90)
		{
			System.out.println("AB");
		}
		else if(marks>70&&marks<=80)
		{
			System.out.println("BB");
		}
		else if(marks>60&&marks<=70)
		{
			System.out.println("BC");
		}
		else if(marks>50&&marks<=60)
		{
			System.out.println("CD");
		}
		else if(marks>40&&marks<=50)
		{
			System.out.println("DD");
		}
		else if(marks>30&&marks<=40)
		{
			System.out.println("Fail");
		}
	}
}
