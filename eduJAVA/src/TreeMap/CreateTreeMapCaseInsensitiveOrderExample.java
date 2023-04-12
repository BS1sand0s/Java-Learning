package TreeMap;
 
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class CreateTreeMapCaseInsensitiveOrderExample {
    public static void main(String[] args) {
        SortedMap<String, String> fileExtensions = new TreeMap<>(new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return s1.compareToIgnoreCase(s2);
                }
            });
        

        fileExtensions.put("PYTHON", ".py");
        fileExtensions.put("c++", ".cpp");
        fileExtensions.put("KOTLIN", ".kt");
        fileExtensions.put("Golang", ".go");

        System.out.println(fileExtensions);
    }
}
