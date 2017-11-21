package practice.codingbat.warmup1;

/*
We have a loud talking parrot. The "hour" parameter is the current hour time
in the range 0..23. We are in trouble if the parrot is talking and the hour is
before 7 or after 20. Return true if we are in trouble.

parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false
*/

public class ParrotTrouble {

    public boolean parrotTrouble(boolean talking, int hour) {     // unsatisfy in one Condition.

        if (hour < 7 || hour >20 && talking)
            return true;

     return false;
    }

//    public boolean parrotTrouble(boolean talking, int hour) {
//        return (talking && (hour < 7 || hour > 20));
//        // Need extra parenthesis around the || clause
//        // since && binds more tightly than ||
//        // && is like arithmetic *, || is like arithmetic +
//    }

    public static void main (String[] args){

        ParrotTrouble parrot = new ParrotTrouble();
        System.out.println(parrot.parrotTrouble(false,6));

    }
}
