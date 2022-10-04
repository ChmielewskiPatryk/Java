
/*
public static boolean containsStr(String str, String search).
Uzupełnij ciało metody tak,
aby zwracała informację czy zmienna str zawiera w sobie element napisu ze zmiennej search.
*/
public class Main {

    public static void main(String[] args) {

        System.out.println(containsStr("Pies kot dupa", "kot"));
    }

    static boolean containsStr(String str, String search) {
        boolean result = str.contains(search);
        return result;
    }
}