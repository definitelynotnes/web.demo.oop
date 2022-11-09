import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*class NamesSorter implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
*/
public class LambdaDemo1 {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Peter", "Parker", "Mike", "Anna");
        
/*        Collections.sort(names, new NamesSorter());
        for(String name: names) {
            System.out.println("~~ name: " + name);
        }
*/        
        // () ->
        Comparator<String> nameDescendingSorter = (String a, String b) -> a.compareTo(b) * -1;
        Comparator<String> nameAscendingSorter = (String a, String b) -> a.compareTo(b);
        Collections.sort(names, nameAscendingSorter);
        Collections.sort(names, nameDescendingSorter);
       // Collections.sort(names, (String a, String b) -> a.compareTo(b));
        for (String name: names) {
            System.out.println("~~ name: " + name);
        }
    }
}
