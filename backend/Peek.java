package backend;import java.util.List;
import java.util.stream.Collectors;

import java.util.stream.Stream;

public class Peek {
    public static void main(String[] args) {

        List<String> val = Stream.of("apple","banana","orange")
                .peek(s -> System.out.println("First Indncator  = " + s))
                .map(String::toUpperCase)
                .peek(s -> System.out.println(s))
                .filter(s -> s.contains("PP"))
                .peek(s -> System.out.println(" Secodn Indicator "+s))
                .collect(Collectors.toList());



        System.out.println(val);
        
    }
}
