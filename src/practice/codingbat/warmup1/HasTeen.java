package practice.codingbat.warmup1;

/*
We'll say that a number is "teen" if it is in the range 13..19
inclusive. Given 3 int values, return true if 1 or more of them are teen.

hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
*/

public class HasTeen {
    public boolean hasTeen(int a, int b, int c) {

    return (13<=a && a<=19)||(13<=b && b<=19)|| (13<=c && c<=19);
    }

//    public boolean hasTeen(int a, int b, int c) {
//        // Here it is written as one big expression,
//        // vs. a series of if-statements.
//        return (a>=13 && a<=19) ||
//                (b>=13 && b<=19) ||
//                (c>=13 && c<=19);
//    }

    public static void main(String[] args){
        HasTeen teen = new HasTeen();
        System.out.println(teen.hasTeen(20,20,20));

    }
}

