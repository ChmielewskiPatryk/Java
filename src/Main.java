
/*
public static String replaceChar(String str, char forReplace, char replacement).
Uzupełnij ciało metody tak, aby zwracała napis powstały z zamiany w napisie str
wszystkich znaków forReplace przez znaki replacement.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(replaceStr("aa bb dd ee", "aa", "cc"));
    }

    public static String replaceStr(String str, String forReplace, String replacement) {
        return str.replaceAll(forReplace, replacement);
    }


}