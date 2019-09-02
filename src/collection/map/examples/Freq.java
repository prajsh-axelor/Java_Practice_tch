package collection.map.examples;

import java.util.*;

public class Freq {
    public static void main(String[] args) {
        String [] str = "java Freq if it is to be it is up to me to delegate".split(" ");
        //String [] str = "The Map interface provides three collection views, which allow a map's contents to be viewed as a set of keys, collection of values, or set of key-value mappings. The order of a map is defined as the order in which the iterators on the map's collection views return their elements. Some map implementations, like the TreeMap class, make specific guarantees as to their order; others, like the HashMap class, do not.".split(" ");
        System.out.println("total words in string : " + str.length);
        countFrequencyOfString(str);
    }

    public static void countFrequencyOfString(String [] str){
//        Map<String, Integer> m = new HashMap<>(); //doesn't guarantees any ordering
//        Map<String, Integer> m = new TreeMap<>(); //orders the map according to value of the elements
        Map<String, Integer> m = new LinkedHashMap<>(); //retains the order in which the elements are entered in map

        for(String a : str){
            Integer freq = m.get(a);
            //get() - Returns the value to which the specified key is mapped,
            // or null if this map contains no mapping for the key
            m.put(a, (freq == null) ? 1 : freq + 1 );
            //if freq == null, i.e. string occured for the first time.
        }

        System.out.println(m.size() + " distince words : ");
        System.out.println(m);

        Map<String, Integer> treeMap = new TreeMap<>(m);
        Map<String, Integer> hashMap = new HashMap<>(m);

        System.out.println(treeMap);
        System.out.println(hashMap);

        System.out.println(checkBulkOperations(hashMap));
    }

    public static Map<String, Integer> checkBulkOperations(Map<String, Integer> map){
        Map<String, Integer> result = new HashMap<>();
        result.putAll(map);
//        collectionView(result);
        result.clear();
        result.put("Prajjwal", 72);
        result.put("Kinjal", 32);
        result.put("Prerna", 79);
        mapIterator(result);
        return result;
    }

    public static void mapIterator(Map<String, Integer> map){
        for (String str : map.keySet())
            System.out.println(str);
        for (Integer i : map.values())
            System.out.println(i);

        System.out.println("+====USING ITERATOR====+");

        for(Iterator<String> it = map.keySet().iterator(); it.hasNext();){
//            if(it.next().isBogus())
//                it.remove();
            System.out.println("---->>>>>" + it.next());
         }

        System.out.println(map.keySet().getClass().getName());

        System.out.println("========Map.Entry Demo=========");
        //iterating through key-value pair
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
            e.setValue(33); //only safe way to modify a map during iteration
            System.out.println(e.getKey() + " : " + e.getValue());
        }



    }

    public static void collectionView(Map<String, Integer> map){
        //provides three ways to view map
//        keySet
//        values
//        entrySet

        System.out.println("keySet : " + map.keySet());
        System.out.println("values : " + map.values());
        System.out.println("entrySet : " + map.entrySet());
    }
}
