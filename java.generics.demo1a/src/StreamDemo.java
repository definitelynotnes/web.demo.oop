import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
        
/*        List<String> aList = new ArrayList<>();
        for (String value: stringCollection) {
            if(value.startsWith("a")) {
                aList.add(value);
            }
        }
        for(String a: aList) {
            System.out.println(a);
        }
*/        
        Predicate<String> shouldStartWithLetterA = (value) -> value.startsWith("a");
        List<String> aCollection = stringCollection.stream()
                                                    .filter(shouldStartWithLetterA)
                                                    .collect(Collectors.toList());
        // Method reference operator :: allow you to call a static method and pass the lambda expression over there
        aCollection.forEach(System.out::println);
        
        System.out.println("~~");
        stringCollection.stream()
                        .sorted()
                        .filter(shouldStartWithLetterA)
                        .forEach(System.out::println);
        
        System.out.println("~~");
        stringCollection.stream()
                        .map(String::toUpperCase)
                        .sorted()
                        .forEach(System.out::println);
        
        // matching methods: anyMatch, allMatch, noneMatch
        boolean anyValueThatStartsWithA = stringCollection.stream().anyMatch((s) -> s.startsWith("a"));
        boolean allStartsWithA = stringCollection.stream().allMatch((s) -> s.startsWith("a"));
        boolean noneStartsWithX = stringCollection.stream().noneMatch((s) -> s.startsWith("x"));
        
        System.out.println("anyValueThatStartsWithA: " + anyValueThatStartsWithA);
        System.out.println("allStartsWithA: " + allStartsWithA);
        System.out.println("noneStartsWithX: " + noneStartsWithX);
        
        // counting
        long startsWithACount = stringCollection.stream()
                                                .filter(shouldStartWithLetterA)
                                                .count();
        System.out.println(startsWithACount);
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> reduced = numbers.stream().reduce((x, y) -> x+y);
        System.out.println("Sum: " + reduced.get());
    }
}
