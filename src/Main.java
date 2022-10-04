
/*
umieść metodę o sygnaturze public static int countTokens(String str),
uzupełnij ciało metody tak, aby zwracała liczbę wyrazów w podanym ciągu znaków.
Metoda powinna pomijać białe znaki.

Przykład: dla String str = " To jest tekst do "; mamy otrzymać wartość 4;
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(countTokens(" To jest tekst do "));
    }
    public static int countTokens(String str){
        String[] words = str.trim().split(" ");
        return words.length;
    }
}