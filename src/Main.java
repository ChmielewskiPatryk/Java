
/*
public static String toggleChar(String str) .
Uzupełnij ciało metody tak, aby zamieniała duże litery na małe i odwrotnie,
a następnie zwracała wynik.
Przykład: dla napisu TaK wyświetli tAk.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(toggleChar("aAdSeGFDdsssd"));
    }
    static String toggleChar(String str) {
        char[] arr = str.toCharArray();
        int len = arr.length;
        String toggledString;
        for (int i = 0; i < len; i++) {
            if (Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            } else {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        toggledString = String.valueOf(arr);
        return toggledString;
    }
}