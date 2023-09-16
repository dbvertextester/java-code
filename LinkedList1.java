import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedList1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        LinkedList<String> al=new LinkedList<String>();  
        al.add("Ajay");  
        al.add("Vijay");  
        al.add("Ravi");  
        al.add("Ajay");  

        al.stream().distinct().forEach(s -> System.out.println(s));
        
        //  System.out.println(str);
        // Iterator <String> itr=al.iterator();
          
        // while(itr.hasNext()){  
        // System.out.println(itr.next());  
        // }  
}
}
