package practice.codingbat.warmup1;

/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 2 int values, return true if one or the other is teen, but not both.

loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
*/

public class LoneTeen {

    public boolean loneTeen(int a, int b) {   // Incorrect

        if ( (13<=a && a<=19)||(13<=b && b<=19))
            return true;
        if ( (13<=a && a<=19) && (13<=b && b<=19))
            return false;

        return false;
    }

//    public boolean loneTeen(int a, int b) {
//        // Store teen-ness in boolean local vars first. Boolean local
//        // vars like this are a little rare, but here they work great.
//        boolean aTeen = (a >= 13 && a <= 19);
//        boolean bTeen = (b >= 13 && b <= 19);
//
//        return (aTeen && !bTeen) || (!aTeen && bTeen);
//        // Translation: one or the other, but not both.
//        // Alternately could use the Java xor operator, but it's obscure.
//    }

    public static void main(String[] args){
        LoneTeen lone = new LoneTeen();
        System.out.println(lone.loneTeen(13,13));
    }

}
