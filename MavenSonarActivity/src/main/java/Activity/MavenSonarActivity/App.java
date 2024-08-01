package Activity.MavenSonarActivity;
import java.util.*;
public class App 
{
	public static void main(String[] args) {
        SortedMap<String, String> marketProjects = new TreeMap<>();
        // Add some market-project mappings
        marketProjects.put("US", "Project A");
        marketProjects.put("EU", "Project B");
        marketProjects.put("APAC", "Project C");
 
        // Display the mappings
        for (String market : marketProjects.keySet()) {
            System.out.println("Market: " + market + ", Project: " + marketProjects.get(market));
        }
}
}