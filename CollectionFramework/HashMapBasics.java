package CollectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapBasics {
    public static void main(String[]args){

         Map<String, String> mapping = new HashMap<>();

         // insertion
         mapping.put("in", "India");
         mapping.put("en", "Englandd");
         mapping.put("us", "United States");

         System.out.println(mapping);

         Map<String, String> table = new HashMap<>();
         table.put("br", "Brazil");

         System.out.println("Before: " + table);
         table.putAll(mapping);
         System.out.println("After: " + table);


         // deletion
         table.remove("en");
         System.out.println(table);





         table.putIfAbsent("is", "India3");
         System.out.println(table);

         System.out.println(table.get("br"));

         System.out.println(table.getOrDefault("usa","NONE"));

         System.out.println(table.containsKey(("in")));

         System.out.println(table.containsValue("India"));




         System.out.println(table);

         table.replace("in", "Indonesia");
         System.out.println(table);

        //  table.remove("in");
        //  System.out.println(table);


        

       Set<String> keyset = table.keySet();
       System.out.println(keyset);

       Collection<String> valueset = table.values();
       System.out.println(valueset);

      Set<Entry<String, String>> entryset = table.entrySet();
      System.out.println("Printing entries: " + entryset);
    }
}
