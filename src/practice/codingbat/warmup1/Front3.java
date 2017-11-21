package practice.codingbat.warmup1;

/*
Given a string, we'll say that the front is the first 3
chars of the string. If the string length is less than 3,
the front is whatever is there. Return a new string which is 3 copies of the front.

front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
*/

public class Front3 {

    public String front3(String str) {   // Correct
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        }
        else {
            front = str;
        }

        return front + front + front;
    }

    public static void main(String[] args){
        Front3 copy3 = new Front3();
        System.out.println(copy3.front3("a"));
    }
}
