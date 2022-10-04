import java.util.Arrays;

/*
Wypisz na konsoli sumę wszystkich elementów tablicy.
Oczekiwany wynik to 124.
*/
public class Main {
    public static void main(String[] args) {
        int[][] task3Array = {{2, 3, 4, 6}, {12, 32, 12, 11}, {3, 2, 1, 4, 5}, {5, 1, 6, 7, 8}};
        System.out.println(sum(task3Array));
    }
    public static int sum(int[][] arr) {
        int acc = 0;
        for (int[] singleArr : arr) {
            for (int item : singleArr) {
                acc += item;
            }
        }
        return acc;
    }

}