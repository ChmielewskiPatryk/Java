//stwórz tablicę o nazwie numbers zawierającą 10 dowolnych liczb,
//posortuj rosnąco tablicę wykorzystując metody klasy Arrays,
//wyświetl w konsoli posortowaną tablicę – również przy pomocy metody z klasy Arrays.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 7, 3, 5, 2, 8, 6, 4, 9};
        Arrays.sort(numbers);
        for (int num : numbers) {
            System.out.print(num + ",");
        }

    }
}