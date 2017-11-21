package practice.codingbat.string1;

/*
Given an "out" string length 4, such as "<<>>", and a word,
return a new string where the word is in the middle of the out
string, e.g. "<<word>>". Note: use str.substring(i, j) to extract
the String starting at index i and going up to but not including index j.

makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
*/

public class MakeOutWord {
    public String makeOutWord(String out, String word) {
        StringBuilder sb = new StringBuilder(out);
        return sb.substring(0,2)+word+sb.substring(2,4);

    }

    public static void main(String[] args){
        MakeOutWord make = new MakeOutWord();
        System.out.println(make.makeOutWord("{{}}","Yay"));
    }
}
