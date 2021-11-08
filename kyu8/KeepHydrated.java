/*8 kyu
Keep Hydrated!
Nathan loves cycling.
Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.
For example:
time = 3 ----> litres = 1
time = 6.7---> litres = 3
time = 11.8--> litres = 5
Fundamentals
Algorithms
Mathematics
Numbers
*/

// public class KeepHydrated  {

//     public int Liters(double time)  {
//       double d = 0.5d;
//       int litres = (int)Math.floor(d*time);
//       return litres;
//     }
//   }

//How this works
package kyu8;

public class KeepHydrated {
    public static void main(String[] args) {
        double drinks = 0.5d;
        double time = 3;
        int litres = (int)Math.floor(drinks*time);
        System.out.println(litres);
    }
    
}
