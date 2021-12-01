/*8 kyu
Parse nice int from char problem
Ask a small girl - "How old are you?". She always says strange things... Lets help her!

For correct answer program should return int from 0 to 9.

Assume test input string always valid and may look like "1-year-old" or "5 years old", etc. The first char is number only.
Fundamentals
Integers
Numbers
Chars
 */

//public class CharProblem {
//    public static int howOld(final String herOld) {
//        String[] herOld1 = herOld .split("");
//        int howOld = Integer.parseInt(herOld1[0]);
//        return howOld;
//    }
//}

// How this works
package kyu8;

public class ParseNiceIntFromCharProblem {
    public static void main(String[] args){
        String herOld = "1-year-old";
        String[] herOld1 = herOld .split("");
        int howOld = Integer.parseInt(herOld1[0]);
        System.out.println(howOld);
    }
}
