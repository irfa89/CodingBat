package practice.codingbat.string1;

/*
Given a string, return a new string made of 3
copies of the last 2 chars of the original string.
The string length will be at least 2.

extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
*/

public class ExtraEnd {                 // correct
    public String extraEnd(String str) {
        int n = str.length();
    if(n>1){
        StringBuilder sb = new StringBuilder(str);
        return sb.substring(n-2)+sb.substring(n-2)+sb.substring(n-2);

    }
    return str;
    }

//    public String extraEnd(String str) {
//        String end = str.substring(str.length()-2);
//        return end + end + end;
//
//        // Solution notes: the last two chars begin at index str.length()-2
//        // Here we store the chars in a local variable, which makes the code
//        // longer but simpler.
//    }

    public static void main(String[] args){
        ExtraEnd end = new ExtraEnd();
        System.out.println(end.extraEnd("a"));
    }
}
