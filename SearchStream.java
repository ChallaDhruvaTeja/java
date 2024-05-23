import java.util.*;
import java.util.stream.Collectors;

public class SearchStream {

    public static void main(String[] args) {
        List<String> x = Arrays.asList("ace", "axe", "cat", "dog","acer");

        
      List<String> result=SearchStream.search(x);

       
        System.out.println(result);
    }

    public static List<String> search(List<String> list) {
        return list.stream()
                   .filter(word -> word.startsWith("a") && word.length() == 3)
                   .collect(Collectors.toList());
    }
}
