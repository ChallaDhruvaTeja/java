import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<String> x = (str) -> str.length() > 3;
        
        String xy = "HelloWorld";
        boolean result = x.test(xy);
     
        System.out.println( result);
        
    }
}
