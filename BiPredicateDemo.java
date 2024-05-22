import java.util.function.BiPredicate;
public class BiPredicateDemo {
	public static void main(String[]args)
	{   BiPredicate<Integer, Integer> isSumGreaterThan = (num1, num2) -> (num1 + num2) > 10;

	 
    int number1 = 5;
    int number2 = 6;

  
    boolean result = isSumGreaterThan.test(number1, number2);

   
    System.out.println(result);
		
	}
	
}
