
/*
public static String replaceChar(String str, char forReplace, char replacement).
Uzupełnij ciało metody tak, aby zwracała napis powstały z zamiany w napisie str
wszystkich znaków forReplace przez znaki replacement.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(replaceChar("aaaaaadddaaaa",'a','c'));
    }
    public static String replaceChar(String str, char forReplace, char replacement){
        String replace = String.valueOf(forReplace);
        String replacemen = String.valueOf(replacement);
        return  str.replaceAll(replace,replacemen);
    }


}