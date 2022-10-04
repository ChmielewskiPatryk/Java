
/*
public static int[] lessMore(int[][] arr).
Uzupełnij ciało metody tak, aby dla otrzymanej tablicy 2-wymiarowej obliczyć średnią arytmetyczną.
Oblicz ile elementów jest mniejszych a ile większych od średniej.
Metoda ma zwrócić tablicę składającą się z 2 elementów
1 - ilość elementów mniejszych od średniej, 2- ilość elementów większych.
*/
public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 4, 7}, {6, 3, 8}, {7, 5, 7, 2}};
        System.out.println(lessMore(arr)[0]);
        System.out.println(lessMore(arr)[1]);
    }

    public static int[] lessMore(int[][] arr) {
        int count = 0;
        int sum = 0;
        int[] res = new int[2];
        int countLess = 0;
        int countMore = 0;
        double average;

        for (int[] items : arr) {
            for (int item : items) {
                count++;
                sum += item;
            }
        }
        average = sum / count;

        for (int[] items : arr) {
            for (int item : items) {
                if (item > average) {
                    countMore++;
                } else if (item < average) {
                    countLess++;
                }
            }
        }

        res[0] = countLess;
        res[1] = countMore;
        return res;
    }

}