
import java.util.function.Consumer;
import java.util.List;
public class ConsumerPersonDemo {
	public static void main(String args[]) {
		
	
	Consumer<Person> consumergen = (gen) -> System.out.println(gen.getGender().toUpperCase());
	List<Person> personsList = PersonRepository.getAllPersons();
	personsList.forEach(consumergen);
	System.out.println();
	
	Consumer <Person> consumersal = (sal) -> System.out.println(sal.getSalary()+1000);
	personsList.forEach(consumersal);
	}
}