import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMap {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        List <String> lt =    List.of(
              ("Dell"),
              ("Hp"),
              ("Samsung"),
              ("Apple"),    
              ("Lenovo"),
              ("Dell"),
              ("Hp"),
              ("Apple"),    
              ("Lenovo") );

        Map<String,Integer > map =  lt.stream()
                                     .collect(Collectors 
                                    .toMap( Function.identity(), List -> 1, Integer :: sum));
        System.out.println(map);
    }
}
