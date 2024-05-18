import java.util.HashMap;
	import java.util.Map;
public class DAy8Ex {
public static void main(String[]args)
{
	

	
	        String languages = "eng chinese eng telugu chinese hindi chinese";
	        String[] languageArray = languages.split(" ");
	        
	        Map<String, Integer> languageCounts = new HashMap<>();
	        
	        for (String language : languageArray) {
	            if (languageCounts.containsKey(language)) {
	                languageCounts.put(language, languageCounts.get(language) + 1);
	            } else {
	                languageCounts.put(language, 1);
	            }
	        }
	        
	       
	        for (Map.Entry<String, Integer> entry : languageCounts.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
	


}
