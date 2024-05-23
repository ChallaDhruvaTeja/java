import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StramEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sam", "Peter", "ballon", "Sam");
        
        int count = (int) names.stream()
                          .filter(name -> name.length() > 3)
                          .count();
        
        System.out.println("Count of names with length greater than 3: " + count);
        List<String> touppercase= names.stream()
        		.map(String::toUpperCase).
        		collect(Collectors.toList());
        System.out.println(touppercase);
        
        List<String> cityList = Arrays.asList("chennai", "mumbai", "bangalore", "", "delhi", "chicago");
        List<String> toUppercase=cityList.stream()
        		.map(String::toUpperCase).
        		collect(Collectors.toList());
        System.out.println(toUppercase);
        long countofCity=cityList.stream().
        		filter(city->city.length()>6)
        		.count();
        System.out.println(countofCity);
        List<String> filtercities=cityList.stream()
        		.filter(city->city.startsWith("c"))
        		.collect(Collectors.toList());
        
       System.out.println(filtercities);
       List<String> filtercity=cityList.stream()
    		   .filter(city->city.contains("ai")).
    		   collect(Collectors.toList());
       System.out.println(filtercity);
       
       List<String> appendcity=cityList.stream()
    		   .map(city->city+"metro")
    		   .collect(Collectors.toList());
       System.out.println(appendcity);
       
       long countofCitys=cityList.stream()
    		   .filter(city->city.contains("c"))
    		   .count();
       System.out.println(countofCitys);
       
       long countoEmptystrings=cityList.stream()
    		   .filter(String::isEmpty)
    		   .count();
       System.out.println(countoEmptystrings);
       
       List<String> nonEmptyCities = cityList.stream()
               .filter(city -> !city.isEmpty())
               .collect(Collectors.toList());
       System.out.println(nonEmptyCities);
       
      

       
           
      

   
}
}

