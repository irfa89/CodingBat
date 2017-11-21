package practice.codingbat.warmup1;

/*
Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
*/

import com.sun.xml.internal.fastinfoset.util.CharArray;

public class FrontBack {

    public String frontBack(String str) {   // correct
       int n =str.length();
       if(n <=1)
           return str;
       else
           return str.charAt(n-1)+str.substring(1,n-1)+str.charAt(0);
    }

//    public String frontBack(String str) {
//        if (str.length() <= 1) return str;
//
//        String mid = str.substring(1, str.length()-1);
//
//        // last + mid + first
//        return str.charAt(str.length()-1) + mid + str.charAt(0);
//    }

    public static void main(String[] args){

        FrontBack Str = new FrontBack();
        System.out.println(Str.frontBack("s"));

    }

}
