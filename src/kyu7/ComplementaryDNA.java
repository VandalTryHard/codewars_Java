/*
7 kyu
Complementary DNA
Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions"
for the development and functioning of living organisms.

If you want to know more: http://en.wikipedia.org/wiki/DNA

In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with
one side of the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand
is never empty or there is no DNA at all (again, except for Haskell).

More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)

Example: (input --> output)

"ATTGC" --> "TAACG"
"GTAT" --> "CATA"

dnaStrand []        `shouldBe` []
dnaStrand [A,T,G,C] `shouldBe` [T,A,C,G]
dnaStrand [G,T,A,T] `shouldBe` [C,A,T,A]
dnaStrand [A,A,A,A] `shouldBe` [T,T,T,T]

Fundamentals
Strings
 */

/*
public class DnaStrand {
  public static String makeComplement(String dna) {
    String check = "ATCG";
        String new_ = "";
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == check.charAt(0)) {
                new_ += "T";
            } else if (dna.charAt(i) == check.charAt(1)) {
                new_ += "A";
            } else if (dna.charAt(i) == check.charAt(2)) {
                new_ += "G";
            } else if (dna.charAt(i) == check.charAt(3)) {
                new_ += "C";
            }
        }
        return new_;
  }
}
 */

// How This works
package kyu7;

public class ComplementaryDNA {
    public static void main(String[] args){
        System.out.println(makeComplement("AAAA"));
        System.out.println(makeComplement("ATTGC"));
        System.out.println(makeComplement("GTAT"));
    }
    public static String makeComplement(String dna) {
        String check = "ATCG";
        String new_ = "";
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == check.charAt(0)) {
                new_ += "T";
            } else if (dna.charAt(i) == check.charAt(1)) {
                new_ += "A";
            } else if (dna.charAt(i) == check.charAt(2)) {
                new_ += "G";
            } else if (dna.charAt(i) == check.charAt(3)) {
                new_ += "C";
            }
        }
        return new_;
    }
}
