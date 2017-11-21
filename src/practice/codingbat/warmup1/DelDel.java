package practice.codingbat.warmup1;

/*
Given a string, if the string "del" appears starting at index 1, return a string
where that "del" has been deleted. Otherwise, return the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
*/

public class DelDel {

    public String delDel(String str) {      // Partly Correct
        String test = str.substring(1,4);
        if(test.equalsIgnoreCase("del")) {
            StringBuilder sb = new StringBuilder(str);
            return sb.charAt(0) + sb.substring(4, str.length());
        }
         else
             return str;
    }

//    public String delDel(String str) {
//        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
//            // First char + rest of string starting at 4
//            return str.substring(0, 1) + str.substring(4);
//        }
//        // Otherwise return the original string.
//        return str;
//    }

    public static void main(String[] args){
        DelDel del = new DelDel();
        System.out.println(del.delDel("adelHello"));
    }

}
