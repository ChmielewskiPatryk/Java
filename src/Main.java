
/*
W pliku Main06.java napisz program,
który dla znajdującej się w pliku zmiennej str wyświetli na konsoli odwrócony napis.
Przykład: dla napisu Tak wyświetli kaT.
*/
public class Main {

    public static void main(String[] args) {
        String str = "codersLabxyz";
        String reverseStr;
        int length = str.length();
        char[] reverse = new char[length];
        for (int i = 0; i < length; i++) {
            reverse[i] = str.charAt(length - 1 - i);
        }
        reverseStr = String.valueOf(reverse);
        System.out.println(reverseStr);
    }
}