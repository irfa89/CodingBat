package practice.codingbat.string1;

/*
Given a string, return a version without the first and last char, so "Hello"
yields "ell". The string length will be at least 2.

withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
*/

public class WithoutEnd {

    public String withoutEnd(String str) {
        if (str.length()>=2)
            return str.substring(1,str.length()-1);
        else
            return str;

    }

    public static void main(String[] args){
       WithoutEnd noend = new WithoutEnd();
        System.out.println(noend.withoutEnd("ab"));
    }
}
