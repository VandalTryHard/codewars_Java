package kyu7;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args){
        String s = "ultrarevolutionariees";
        String check = "aeiou";
        String vowel_string = "";
        ArrayList<String> vowel_list = new ArrayList<>() ;
        for(int i = 0; i < s.length(); i++) {
            for (int j = 0; j < check.length(); j++) {
                if (s.charAt(i) == check.charAt(j)) {
                    vowel_string += s.charAt(i);
                } else {
                    vowel_list.add(vowel_string);
                    vowel_string = new String("");
                }
            }
        }
        System.out.println(vowel_list);
//        Collection.sort(vowel_list);
        System.out.println(vowel_list);
    }
//    public static int solve(String s){
//        String check = "aeiou";
//        String vowel_string = "";
//        ArrayList<String>vowel_list = new ArrayList<>() ;
//        for(int i = 0; i <= s.length(); i++) {
//            for (int j = 0; j <= check.length(); j++) {
//                if (s.charAt(i) == check.charAt(j)) {
//                    vowel_string += s.charAt(i);
//                } else {
//                    vowel_list.add(vowel_string);
//                    vowel_string = "";
//                }
//            }
//        }
//        return 5;
//    }
}
