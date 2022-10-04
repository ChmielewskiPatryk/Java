import java.util.Arrays;

/*
1. wypisz element znajdujący się w 3 kolumnie i 2 wierszu,
oczekiwana wartość to 12
2. wypisz długość tablicy znajdującej się w drugim wierszu,
oczekiwana wartość to 4
3.wypisz element znajdujący się w 4 kolumnie i 3 wierszu.
oczekiwana wartość to 4
*/
public class Main {
    public static void main(String[] args) {
        int[][] task1Array = {{2, 3, 4}, {12, 32, 12, 11}, {3, 2, 1, 4, 5}, {5, 1, 6, 7, 8}};
        System.out.println(task1Array[1][2]); //1
        System.out.println(task1Array[1].length); //2
        System.out.println(task1Array[2][3]); //3
    }

}