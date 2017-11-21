package practice.codingbat.warmup1;
/*
Given 2 int values, return true if they are both in the range 30..40 inclusive,
or they are both in the range 40..50 inclusive.

in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
*/

public class In3050 {
    public boolean in3050(int a, int b) {             //correct
    boolean x3040 = (a>=30 && a<=40 && b>=30 && b<=40 );
    boolean y4050 = (a>=40 && a<=50 && b>=40 && b<=50 );
    if (x3040 || y4050)
        return true;
    else
        return false;
    }

//    public boolean in3050(int a, int b) {
//        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
//            return true;
//        }
//        if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
//            return true;
//        }
//        return false;
//        // This could be written as one very large expression,
//        // connecting the two main parts with ||
//    }

    public static void main(String[] args){
        In3050 in = new In3050();
        System.out.println(in.in3050(40,50));
    }
}
