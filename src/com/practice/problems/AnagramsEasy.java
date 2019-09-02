package com.practice.problems;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsEasy {
static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] aa = a.toLowerCase().toCharArray();
        Arrays.sort(aa);
        char[] ba = b.toLowerCase().toCharArray();
        Arrays.sort(ba);
        if(Arrays.equals(aa,ba)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}