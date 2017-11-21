package practice.codingbat.warmup1;

/*
Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
*/

public class StringE {

    public boolean stringE(String str) {  // Partly Correct
        char[] ch = str.toCharArray();
        for(int i =0; i< 3;i++) {
            ch[i] = 'e';
            return true;
        }
    return false;

    }

//    public boolean stringE(String str) {
//        int count = 0;
//
//        for (int i=0; i<str.length(); i++) {
//            if (str.charAt(i) == 'e') count++;
//            // alternately: str.substring(i, i+1).equals("e")
//        }
//
//        return (count >= 1 && count <= 3);
//    }

    public static void main(String[] args){
        StringE strE = new StringE();
        System.out.println(strE.stringE("Hi"));
    }
}
