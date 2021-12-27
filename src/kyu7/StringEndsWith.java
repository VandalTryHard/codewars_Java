/*
7 kyu
String ends with?
Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd
argument (also a string).

Examples:

solution('abc', 'bc') // returns true
solution('abc', 'd') // returns false

Fundamentals
Strings
 */

/*
public class Kata {
  public static boolean solution(String str, String ending) {
    return str.endsWith(ending);
  }
}
*/

// How this works
package kyu7;

public class StringEndsWith {
    public static void main(String[] args){
        System.out.println(solution("abc", "bc"));
        System.out.println(solution("abc", "d"));
        System.out.println(solution("samurai", "ra"));
        System.out.println(solution("samurai", "ai"));
    }
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
}
