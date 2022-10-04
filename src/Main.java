
/*
public static String[] onlyTwoElements(String str, char separator).
Uzupełnij ciało metody tak, aby zwracała tablicę dwóch elementów,
które powstały po podzieleniu tekstu (str) po pierwszym napotkanym znaku podziału (separator).
Przykład dla napisu Java-zadania-podzial-napisow oraz separatora - otrzymamy:
pierwszy element tablicy: Java
drugi element: zadania-podzial-napisow.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(onlyTwoElements("Java-zadania-podzial-napisow",'-')[0]);
        System.out.println(onlyTwoElements("Java-zadania-podzial-napisow",'-')[1]);
    }
    public static String[] onlyTwoElements(String str, char separator){
        String sep = String.valueOf(separator);
        return str.split(sep,2);
    }
}