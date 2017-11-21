package practice.codingbat.warmup1;

/*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.

in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
*/

public class In1020 {
    public boolean in1020(int a, int b) {     // correct
        if ((10<=a && a<=20) || (10<=b && b<=20))
            return true;
        return false;

    }

//    public boolean in1020(int a, int b) {
//        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
//    }

    public static void main(String[] args){

       In1020 in = new In1020();
        System.out.println(in.in1020(8,99));
    }
}
