package collection.map.examples;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        int minGroupSize = 8; //minimum anagram group size

        //a simulated multimap
        Map<String, List<String>> m = new HashMap<String, List<String>>();

        try{
            Scanner s = new Scanner(new File("/home/axelor/IdeaProjects/Java_Practice_tch/src/collection/map/examples/dictionary.txt"));
            while(s.hasNext()){
                String word = s.next();
                String alpha = alphabetize(word);
                List<String> l = m.get(alpha);
                if(l == null)
                    m.put(alpha, l = new ArrayList<String>());
                l.add(word);
            }
        } catch (IOException e ){
            System.err.println(e);
            System.exit(1);
        }

        //print all permutation groups above size threshold
        for(List<String> l : m.values())
            if(l.size() >= minGroupSize)
                System.out.println(l.size() + ": " + l);
    }

    public static String alphabetize(String s){
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
