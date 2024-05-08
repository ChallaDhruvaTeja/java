import java.util.Scanner;
public class Day2Switch {

	public static void main(String[] args) {
		char x;
		Scanner sc=new Scanner(System.in);
		x=sc.next().charAt(0);
		
		switch(x)			
		{
		case 'A':
			 System.out.println("Excellent");
			 break;
		case 'B':
			 System.out.println("Good");
			 break;
		case 'C':
			 System.out.println("Average");
			 break;
		case 'D':
			 System.out.println("OK");
			 break;
		case 'E':
			 System.out.println("Bad");
			 break;
	    default:
	    	
	    	 System.out.println("Invaid");
			 
		}
	}

}
