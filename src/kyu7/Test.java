package kyu7;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args){
        String check = "ATCG";
        String new_ = "";
        System.out.println(check.charAt(1));
        for(int i = 0; i < check.length(); i++){
            System.out.println(check.charAt(i));
            new_ += check.charAt(i);
        }
        System.out.println(new_);
    }
}
