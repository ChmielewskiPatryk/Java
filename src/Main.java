
/*
public static String stringFromArray(String[] str).
Uzupełnij ciało metody tak,
aby zwracała napis powstały z połączenia wszystkich napisów występujących w tablicy str.
*/
public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"aaaa", "bbbb", "cccc", "dddd"};
        System.out.println(stringFromArray(stringArray));

    }

    static String stringFromArray(String[] str) {
        return String.join("", str);
    }
}