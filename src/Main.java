
/*
Uzupełnij ciało metody tak, aby dla otrzymanej tablicy 2-wymiarowej
dla każdego jej wiersza wyznaczyła minimalną wartość.
Poszczególne minimalne wartości mają być umieszczone w tablicy, którą metoda zwraca.
*/
public class Main {
    public static void main(String[] args) {
        int arr[][] = {
                {2, 3, 6, 1},
                {4, 5, 6, 7}
        };
        System.out.println(minimum(arr)[0]);
        System.out.println(minimum(arr)[1]);
    }

    public static int[] minimum(int[][] arr) {
        int[] minValArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int minVal = arr[i][0];

            for (int j = 0; j < arr[i].length; j++) {
                if (minVal > arr[i][j]) {
                    minVal = arr[i][j];
                }
            }
            minValArr[i] = minVal;
        }

        return minValArr;
    }
}