package practice.codingbat.warmup1;

/*
Given 2 int values, return true if one is negative and one is positive.
Except if the parameter "negative" is true, then return true only if both are negative.

posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
*/

public class PosNeg {


    public boolean posNeg(int a, int b, boolean negative) {   // Incorrect

        if ((negative = true) && (a<0 || b<0))
            return true;
        return false;
    }

//    public boolean posNeg(int a, int b, boolean negative) {    // Solution
//        if (negative) {
//            return (a < 0 && b < 0);
//        }
//        else {
//            return ((a < 0 && b > 0) || (a > 0 && b < 0));
//        }
//    }

    public static void main(String[] args){

        PosNeg out = new PosNeg();

        System.out.println(out.posNeg(4,5,false));
    }

}

