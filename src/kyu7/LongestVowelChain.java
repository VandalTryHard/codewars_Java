//7 kyu
//Longest vowel chain
//The vowel substrings in the word codewarriors are o,e,a,io. The longest of these has a length of 2.
//Given a lowercase string that has alphabetic characters only (both vowels and consonants) and no spaces,
//return the length of the longest vowel substring. Vowels are any of aeiou.
//
//Good luck!
//
//If you like substring Katas, please try:
//
//Non-even substrings
//
//Vowel-consonant lexicon
//Fundamentals
//Strings

//import java.util.ArrayList;
//class Solution{
//    public static int solve(String s){
//        var vowels = new ArrayList<Character>();
//        vowels.add('a');
//        vowels.add('e');
//        vowels.add('i');
//        vowels.add('o');
//        vowels.add('u');
//        var arr = s.toCharArray();
//        int max = 0;
//        int counter = 0;
//        for (int i = 0; i < arr.length ; i++) {
//            if (vowels.contains(arr[i])){
//                counter++;
//            }else{
//                if (counter>max){
//                    max = counter;
//                }
//                counter = 0;
//            }
//        }
//        if (counter>max){
//            max = counter;
//        }
//        return max;
//    }
//}


// How this works
package kyu7;

import java.awt.*;
import java.util.ArrayList;

public class LongestVowelChain {
    public static void main(String[] args){
        String s = "ultrarevolutionariees";
        System.out.println(solve(s));
    }
    public static int solve(String s){
        var vowels = new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        var arr = s.toCharArray();
        int max = 0;
        int counter = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (vowels.contains(arr[i])){
                counter++;
            }else{
                if (counter>max){
                    max = counter;
                }
                counter = 0;
            }
        }
        if (counter>max){
            max = counter;
        }
        return max;
    }
}
