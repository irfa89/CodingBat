package practice.codingbat.string1;

/*
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
*/

public class HelloName {

    public String helloName(String name) {   // Incorrect

        return '"'+"Hello "+name+"!"+'"';
    }

//    public String helloName(String name) {
//
//        return "Hello "+name+"!";
//    }

    public static void main(String[] args){
        HelloName hello = new HelloName();
        System.out.println(hello.helloName("X"));
    }
}
