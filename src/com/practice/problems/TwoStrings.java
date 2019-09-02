package com.practice.problems;

import java.io.*;
import java.util.*;

public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        int length = s1.length() < s2.length() ? s2.length() : s1.length();
        for(int i = 0 ; i < length ; i++){
            if(i < s1.length())
                set1.add(s1.charAt(i));
            if(i < s2.length())
                set2.add(s2.charAt(i));
        }

        for(Character c : set2)
            if(set1.contains(c))
                return "YES";

        return  "NO";
    }


    public static void main(String[] args) throws IOException {
       String s1 = "abcedfg";
       String s2 = "ppc";

        System.out.println(twoStrings(s1,s2));
    }
}
