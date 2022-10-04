
/*
public static int oddSum(int[][] arr).
Uzupełnij ciało metody tak, aby zliczyła sumę wartości dla wszystkich elementów
z nieparzystych indeksów dla każdego wiersza.
Metoda ma zwrócić sumę.
*/
public class Main {
    public static void main(String[] args) {
        int arr[][] = {
                {2, 3, 6, 1},
                {4, 5, 6, 7}
        };
        System.out.println(oddSum(arr));
    }

    public static int oddSum(int[][] arr) {
        int lenArrMain = arr.length;
        int count = 0;

        for (int i = 0; i < lenArrMain; i++) {
            int lenArrSub = arr[i].length;
            for (int j = 0; j < lenArrSub; j++) {
                if (j % 2 != 0) {
                    count += arr[i][j];
                }
            }
        }
        return count;
    }
}