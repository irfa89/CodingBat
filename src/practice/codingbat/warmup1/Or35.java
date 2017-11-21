package practice.codingbat.warmup1;

/*
Return true if the given non-negative number is a multiple of 3
or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod

or35(3) → true
or35(10) → true
or35(8) → false
*/

public class Or35 {

    public boolean or35(int n) {
        if (n%5 == 0 || n%3==0)
            return true;
        return false;
    }

    public static void main(String[] args){
        Or35 multiple = new Or35();
        boolean status = multiple.or35(8);
        System.out.println(status);

    }
}
