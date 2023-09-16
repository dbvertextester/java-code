import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class array {
    private static List<Object> asList;

    public static void main(String[] args) {
        
    List<String> list = new ArrayList<>();
   list.add("ramlal");
   list.add("vamini");
   list.add("sita");
   list.add("ramlal");

   System.out.println(list);

   list.remove("ramlal");
   list.remove(1);

   System.out.println(list );

    //  Map <Integer, String> lmap = new LinkedHashMap<>();
    //  lmap.put(101, "ram");
    //  lmap.put(102,"kumar");
    //  lmap.put(103, "ram");
    //  lmap.put(104,"kumar");
    //  lmap.put(105,"suman");


    List <String> lt = new LinkedList<String>();
    lt.add("ramu");
    lt.add("sanu");
    lt.add("ramu");
    lt.add("sanu");
     System.out.println(lt);

     Iterator it = (Iterator) lt.iterator();

     while (((java.util.Iterator<String>) it).hasNext()){
        System.out.println( it);

     }

      

     
    }
}
