package testClasses.map;

import java.util.*;

public class LinkedHashMapExample {
    public static void main (String args[]){
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("akanksha", 100);
        linkedHashMap.put("elephant", 150);
        linkedHashMap.put("base-ball", 125);
        linkedHashMap.put("dehradhun", 163);
        linkedHashMap.put("cat-bell", 158);
        linkedHashMap.put(null, 165);

        System.out.println("Iterate over th map using Entery<Key, Value>");
        for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()){
            System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
        }

        System.out.println("*********************************");
        System.out.println("The value for key 'null' is:"+linkedHashMap.get(null));

        System.out.println("*********************************");
        System.out.println("Sorted on the basis of Value");
        for(Map.Entry<String, Integer> entry : sortByValue(linkedHashMap).entrySet()){
            System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
        }

    }

    public static LinkedHashMap<String, Integer> sortByValue(LinkedHashMap<String, Integer> hashMap){
        LinkedHashMap<String, Integer> sortedHashMap = new LinkedHashMap<>();
        {
            LinkedList<Map.Entry<String, Integer>> entryLinkedList = new LinkedList<>(hashMap.entrySet());

            Collections.sort(entryLinkedList, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });

            for(Map.Entry<String, Integer> entry : entryLinkedList){
                sortedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return sortedHashMap;
    }
}
