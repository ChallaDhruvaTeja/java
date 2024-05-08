import java.util.Scanner;
public class Day2IfTask1 {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	String sunday,sat,mon,tue,wed,thu,fri,week = null;
	week=sc.next();
	if(week.equals("sunday")||week.equals("sat"))
	{
		System.out.println("Its weekend");
	}
	else
	{
		System.out.println("weekday");
	}
		
}
}
