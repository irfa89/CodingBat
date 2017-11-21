package practice.codingbat.warmup1;

/*
Given two non-negative int values, return true if they have the same
last digit, such as with 27 and 57. Note that the % "mod" operator
computes remainders, so 17 % 10 is 7.

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
*/

public class LastDigit {              // Correct
    public boolean lastDigit(int a, int b) {
       int x=a,y=b;
       for(int i=0; i < a+b;i++) {
           x = x % 10;
           y = y % 10;
       }
       return (x==y);
    }

//    public boolean lastDigit(int a, int b) {
//        // True if the last digits are the same
//        return(a % 10 == b % 10);
//    }
    public static void main(String[] args){
        LastDigit ldigit = new LastDigit();
        System.out.println(ldigit.lastDigit(10,100));

    }
}
