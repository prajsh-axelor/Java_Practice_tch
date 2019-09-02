package com.practice.problems;

import java.io.IOException;
import java.util.*;

public class HashTablesRansomNote {

    static void checkMagazine(String[] magazine, String[] note) {

        Map<String, Integer> magazineWord = getWordFreq(magazine);
        Map<String, Integer> noteWord = getWordFreq(note);

        String result = "YES";
        //if all the note words are in magazine or not
        if(magazineWord.keySet().containsAll(noteWord.keySet())) {
            //if all the words are in right frequency
            for (Map.Entry<String, Integer> e : noteWord.entrySet()) {
                if (e.getValue() > magazineWord.get(e.getKey())) {
                    result = "NO";
                    break;
                }
            }
        } else {
            result = "NO";
        }

        System.out.println(result);
    }

    static Map<String, Integer> getWordFreq(String [] strArray) {
        Map<String, Integer> map = new HashMap<>();
        for(String str : strArray){
            Integer freq = map.get(str);
            map.put(str, (freq == null) ? 1 : freq + 1);
        }
        System.out.println(map);
        return map;
    }


    public static void main(String[] args) throws IOException {
        String [] s1 = "give me one grand today night".split(" ");
        String [] s2 = "give one grand Today".split(" ");

        checkMagazine(s1, s2);
    }
}
