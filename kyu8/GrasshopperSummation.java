/*8 kyu
Grasshopper - Summation
Summation

Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.

For example:

summation(2) -> 3
1 + 2

summation(8) -> 36
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8

Fundamentals
Loops
Control Flow
Basic Language Features
*/

// public class GrassHopper {

//     public static int summation(int n) {
//       int x = 0;
//       for(int i = 0; i<=n; i++){
//         x=x+i;
//       }
//       return x;
//     }
// }

// How this works
package kyu8;

public class GrasshopperSummation {
    public static void main(String[] args){
        int n = 8;
        int x = 0;
        for (int i = 0; i <= n; i++){
            x= x + i;
        }
        System.out.println(x);
    }
}