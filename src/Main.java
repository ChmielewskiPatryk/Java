import java.util.Arrays;

/*
1. wypisz długości tablic jednowymiarowych, z których składa się tablica dwuwymiarowa,
2. wypisz wszystkie elementy tablicy task2Array (musisz użyć do tego zagnieżdżonej pętli for).
*/
public class Main {
    public static void main(String[] args) {
        int[][] task2Array = {{2, 3, 4}, {12, 32, 12, 11}, {3, 2, 1, 4, 5}, {5, 1, 6, 7, 8}};
        //1
        for (int[] item : task2Array) {
            System.out.println(item.length);
        }
        //2
        for (int[] item : task2Array) {
            for (int item2 : item) {
                System.out.print(item2 +",");
            }
        }

    }

}