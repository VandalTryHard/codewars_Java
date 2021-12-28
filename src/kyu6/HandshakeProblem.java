/*
6 kyu
Handshake problem
Johnny is a farmer and he annually holds a beet farmers convention "Drop the beet".

Every year he takes photos of farmers handshaking. Johnny knows that no two farmers handshake more than once.
He also knows that some of the possible handshake combinations may not happen.

However, Johnny would like to know the minimal amount of people that participated this year just by counting all
the handshakes.

Help Johnny by writing a function, that takes the amount of handshakes and returns the minimal amount of people
needed to perform these handshakes (a pair of farmers handshake only once).
Algorithms
 */

/*
public class Kata
{
  public static int GetParticipants(int handshakes){
        int people = 1;
        int h = handshakes;
        for (int i = 0; i <= h; i++){
            if (handshakes > people*(people-1)/2){
                people +=1;
            }
        }
        return people;
    }
}
 */

// How this works and look this https://nrich.maths.org/6708/solution
package kyu6;

public class HandshakeProblem {
    public static void main(String[] args){
        System.out.println(GetParticipants(0));
        System.out.println(GetParticipants(1));
        System.out.println(GetParticipants(3));
        System.out.println(GetParticipants(6));
        System.out.println(GetParticipants(7));
    }
    public static int GetParticipants(int handshakes){
        int people = 1;
        int h = handshakes;
        for (int i = 0; i <= h; i++){
            if (handshakes > people*(people-1)/2){
                people +=1;
            }
        }
        return people;
    }
}
