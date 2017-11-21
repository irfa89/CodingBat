package practice.codingbat.warmup1;

/*
Given an int n, return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
*/

import static java.lang.StrictMath.abs;

public class Diff21 {                   // Correct

    public int diff21(int n) {
        int k=21;
        if (n<k)
            return abs(k-n);
        else
            return abs(2*(k-n));
    }

//    public int diff21(int n) {
//        if (n <= 21) {
//            return 21 - n;
//        } else {
//            return (n - 21) * 2;
//        }
//    }

    public static void main(String[] args){

        Diff21 diff = new Diff21();
        System.out.println(diff.diff21(20));
    }
}
