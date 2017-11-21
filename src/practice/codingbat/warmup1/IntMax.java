package practice.codingbat.warmup1;

/*
Given three int values, a b c, return the largest.

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
*/

public class IntMax {

    public int intMax(int a, int b, int c) {   // Partly Correct
        int largest = 0;
        int[] num = {a, b, c};
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i])
                largest = num[i];
        }
        return largest;
    }

//    public int intMax(int a, int b, int c) {
//        int max;
//
//        // First check between a and b
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//
//        // Now check between max and c
//        if (c > max) {
//            max = c;
//        }
//
//        return max;
//
//        // Could use the built in Math.max(x, y) function which selects the larger
//        // of two values.
//    }


    public static void main(String[] args){
       IntMax max = new IntMax();
        System.out.println(max.intMax(4,3,1));
    }
}
