package Homework17;

public class iLikeJava {
    public static void main(String[] args) {
        String likeJava = "I like Java!!!";
        System.out.println(likeJava);
        lastChar(likeJava);
        checkLastChar(likeJava);
        checkFirstWords(likeJava);
        checkWordJava(likeJava);
        indexOfWord(likeJava);
        changeA(likeJava);
        upperCase(likeJava);
        lowerCase(likeJava);
    }
    public static void lastChar(String likeJava) {
       char c = likeJava.charAt(likeJava.length() - 1);
       System.out.println("Last char: " + c);
    }
    public static void checkLastChar(String likeJava) {
        if (likeJava.endsWith("!!!")) {
            System.out.println("Ends with: " + "!!!");
        }
        else {
            System.out.println("Doesn't end with: " + "!!!");
        }
    }
    public static void checkFirstWords(String likeJava) {
        if (likeJava.startsWith("I like")) {
            System.out.println("Starts with: " + "I like");
        } else {
            System.out.println("Doesn't start with: " + "I like");
        }
    }
    public static void checkWordJava(String likeJava) {
        if (likeJava.contains("Java")) {
            System.out.println("Have word: " + "Java");
        } else {
            System.out.println("Doesn't have the word: " + "Java");
        }
    }
    public static void indexOfWord(String likeJava) {
        String word = "Java";
        System.out.println("Позиція підрядка: " + likeJava.indexOf(word));
    }
    public static void changeA(String likeJava) {
        System.out.println(likeJava.replace("a", "про"));
    }
    public static void upperCase(String likeJava) {
        System.out.println(likeJava.toUpperCase());
    }
    public static void lowerCase(String likeJava) {
        System.out.println(likeJava.toLowerCase());
    }
}
