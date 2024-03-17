package backend;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Filter {
    public static void main(String[] args) {
        

    Random filterLevel = new Random();

    Map<String,Integer> filterGirls = new HashMap<>();
    filterGirls.put("Ishika", filterLevel.nextInt(10));
    filterGirls.put("Komal", filterLevel.nextInt(10));
    filterGirls.put("Pankhuri", filterLevel.nextInt(10));
    filterGirls.put("palak", filterLevel.nextInt(10));
    filterGirls.put("rupali", filterLevel.nextInt(10));
    filterGirls.put("niharika", filterLevel.nextInt(10));
    filterGirls.put("riya", filterLevel.nextInt(10));
    filterGirls.put("kashvi", filterLevel.nextInt(10));
    filterGirls.put("Ashnoor", filterLevel.nextInt(10));
    filterGirls.put("Vamakshi", filterLevel.nextInt(10));

    filterGirls.entrySet().stream().filter(filterVal -> filterVal.getValue()>2).forEach(System.out::println);





}
    
}
