package practice.codingbat.warmup1;

/*
Given 2 int values, return whichever value is nearest to the value 10,
or return 0 in the event of a tie. Note that Math.abs(n)
returns the absolute value of a number.

close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
*/

public class Close10 {                 // Correct
    public int close10(int a, int b) {
        int diff1 = Math.abs(10 - a);
        int diff2 = Math.abs(10 -b);
        if (diff1 > diff2)
            return  b;
        if (diff2 == diff1)
            return 0;
        else
            return a;
    }

//    public int close10(int a, int b) {
//        int aDiff = Math.abs(a - 10);
//        int bDiff = Math.abs(b - 10);
//
//        if (aDiff < bDiff) {
//            return a;
//        }
//        if (bDiff < aDiff) {
//            return b;
//        }
//        return 0;  // i.e. aDiff == bDiff
//
//        // Solution notes: aDiff/bDiff local vars clean the code up a bit.
//        // Could have "else" before the second if and the return 0.
//    }

    public static void main(String[] args){
        Close10 close = new Close10();
        System.out.println(close.close10(13,7));

    }
}
