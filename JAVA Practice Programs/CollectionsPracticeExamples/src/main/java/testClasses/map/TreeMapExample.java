package testClasses.map;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String args[]) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("akanksha", 100);
        sortedMap.put("elephant", 150);
        sortedMap.put("base-ball", 125);
        sortedMap.put("dehradhun", 163);
        sortedMap.put("cat-bell", 158);

        System.out.println("Iterate over th map using Entery<Key, Value>");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
