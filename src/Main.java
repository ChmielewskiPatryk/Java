
/*
1. pobierze przedostatnią literę zmiennej str, znajdującej się w pliku,
2. wyświetli na konsoli liczbę wystąpień tej litery w całym ciągu znaków
*/
public class Main {
    public static void main(String[] args) {
        String str = "CodersLab jak dobrze zacząć programować";
        int strLength = str.length();
        char getChar = str.charAt(strLength - 2);
        int count = 0;
        for (int i = 0; i < strLength - 1; i++) {
            if (str.charAt(i) == getChar) {
                count++;
            }
        }
        System.out.println(getChar);
        System.out.println(count);

    }
}