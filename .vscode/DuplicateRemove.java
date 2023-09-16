import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRemove {
    
    public static void main(String[] args) {
        
        List <String> lt = new ArrayList<>( );
        lt.add("marserdies");
        lt.add("maruti");
        lt.add("Swift");
        lt.add("marserdies");
        lt.add("maruti");
        lt.add("Swift");
        System.out.println(lt);

        List <String> Distanct = lt.stream().distinct().collect(Collectors.toList());

        System.out.println(Distanct);
    }
}
