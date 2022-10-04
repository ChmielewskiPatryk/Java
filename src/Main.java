
/*
public static String upperCase(String str, int index) .
Metoda zwraca napis str, w którym znaki zostały zamienione
na duże z pozycji podzielnych przez index.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(upperCase("którym znaki zostały zamienione na duże z pozycji", 3));
    }

    public static String upperCase(String str, int index) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (i % index == 0) {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        return String.valueOf(arr);

    }

}