package practice.codingbat.warmup1;

/*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
*/

public class SumDouble {                //Correct

    public int sumDouble(int a, int b) {
        if (!(a == b))
            return a + b;
        else
            return 2 * (a + b);
    }

//    public int sumDouble(int a, int b) {
//        // Store the sum in a local variable
//        int sum = a + b;
//
//        // Double it if a and b are the same
//        if (a == b) {
//            sum = sum * 2;
//        }
//
//        return sum;
//    }

    public static void main(String[] args){

        SumDouble sum = new SumDouble();
        System.out.println(sum.sumDouble(2,2));
    }
}
