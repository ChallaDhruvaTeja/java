import java.util.function.BiConsumer;


public class BiConsumerDemo {

    public static void main(String[] args) {
        BiConsumer<String, Integer> x = (var, num) -> System.out.println(var + (num + 10));
        BiConsumer<String, Integer> y = (var, num) -> System.out.println(var + (num - 10));
    
        // Example usage
        x.accept("The number plus 10 is: ", 5);
   x.andThen(y).accept("the value is", 10);

	
   
   
    }

}
