/*
7 kyu
Regex validate PIN code
ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

If the function is passed a valid PIN string, return true, else return false.
Examples (Input --> Output)

"1234"   -->  true
"12345"  -->  false
"a234"   -->  false

Fundamentals
Regular Expressions
Declarative Programming
Advanced Language Features
Strings
 */


//




// How this works ?????????????????????????????????????????????????? learn..............................................
package kyu7;

public class RegexValidatePINCode {
    public static void main(String[] args){
        String pin1 = "1234";
        String pin2 = "12345";
        String pin3 = "123456";
        String pin4 = ".234";
        String pin5 = "-12345";

        String regex = "\\d+";
    }
    public static boolean Func2(String pin){
        if(pin.length() == 4 || pin.length()==6){
            return true;
        }else{
            return false;
        }
    }
}
