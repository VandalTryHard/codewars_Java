//7 kyu
//Is this a triangle?
//Implement a function that accepts 3 integer values a, b, c. The function should return true if a triangle can be
// built with the sides of given length and false in any other case.
//
//(In this case, all triangles must have surface greater than 0 to be accepted).
//Fundamentals
//Mathematics
//Algorithms
//Numbers
//Utilities



// How this works
package kyu7;

public class IsThisATriangle {
    public static void main(String[] args){
        System.out.println(isTriangle(1,2,2));
        System.out.println(isTriangle(7,2,2));
    }
    public static boolean isTriangle(int a, int b, int c){
     if (a+b>c && b+c>a && a+c>b){
         return true;
     }
     return false;
    }
}
