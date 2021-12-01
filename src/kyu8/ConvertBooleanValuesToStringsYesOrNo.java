/*8 kyu
Convert boolean values to strings 'Yes' or 'No'.
Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.
*/

// class YesOrNo
// {
//   public static String boolToWord(boolean b)
//   {
//     if (b == true){
//         return "Yes";
//     }else{
//         return "No";
//     }
//   }
// }

//How this works
package kyu8;

public class ConvertBooleanValuesToStringsYesOrNo {
    public static void main(String[] args){
        boolean str_ = false;
        if (str_ == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
