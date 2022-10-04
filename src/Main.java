
/*
public static String firstHalf(String str).
Uzupełnij ciało metody tak, aby zwracała połowę napisu (uwzględniamy tylko część całkowitą podziału).
Przykład: dla napisu CodersLab zwróci Code.
*/
public class Main {

    public static void main(String[] args) {
        System.out.println(firstHalf("CodersLab"));

    }

    static String firstHalf(String str) {
        int length = str.length() / 2;
        String result = str.substring(0, length);
        return result;
    }
}