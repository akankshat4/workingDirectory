package testClasses.map;

import java.util.*;

public class HashMapExample {

    public static void main(String args[]){
        Map<String, Integer> hashMapExample = new HashMap<>();
        hashMapExample.put("akanksha", 100);
        hashMapExample.put("elephant", 150);
        hashMapExample.put("base-ball", 125);
        hashMapExample.put("dehradhun", 163);
        hashMapExample.put("cat-bell", 158);
        hashMapExample.put(null, 165);

        System.out.println("Iterate over th map using Entery<Key, Value>");
        for(Map.Entry<String, Integer> entry : hashMapExample.entrySet()){
            System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
        }

        System.out.println("*********************************");
        System.out.println("The value for key 'null' is:"+hashMapExample.get(null));

        System.out.println("*********************************");
        System.out.println("Hash Map sorted on Values using comparator");
        for(Map.Entry<String, Integer> entry : sortByValue(hashMapExample).entrySet()){
            System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
        }

    }

    public static HashMap<String, Integer> sortByValue(Map<String, Integer> hashMap){
        List<Map.Entry<String, Integer>> entryLinkedList = new LinkedList<Map.Entry<String , Integer>>(hashMap.entrySet());

        Collections.sort(entryLinkedList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

        HashMap<String, Integer> sortedHashMap = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> entry : entryLinkedList){
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }

        return sortedHashMap;
    }
}
