package practice.codingbat.warmup1;

/*
Given a string, take the last char and return a new string with the last
char added at the front and back, so "cat" yields "tcatt". The original string
will be length 1 or more.

backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
*/

public class BackAround {

    public String backAround(String str) {    // correct

        StringBuilder sb = new StringBuilder(str);
        return sb.charAt(str.length()-1)+sb.substring(0,str.length())+sb.charAt(str.length()-1);
    }

//    public String backAround(String str) {
//        // Get the last char
//        String last = str.substring(str.length() - 1);
//        return last + str + last;
//    }

    public static void main(String[] args){
        BackAround back = new BackAround();
        System.out.printf(back.backAround("a"));

    }
}
