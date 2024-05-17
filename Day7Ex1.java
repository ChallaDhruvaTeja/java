import java.util.ArrayList;
public class Day7Ex1 {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<>();
		list.add("chocloate");
		list.add("biscut");
		list.add("tea");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.contains("pizza"));
		for(String x:list)
		{
			System.out.println(x);
		}
//		list.add(4,"icecream");
//		System.out.println(list);//list wont  print index 4 icecream because size itself is 3
		list.remove(2);
		System.out.println(list);
		
	}

}
