import java.util.Arrays;

/*
public static boolean contains(int[] arr, int element).
uzupełnij ciało metody tak, by sprawdzała, czy w tablicy arr istnieje element,
jeżeli tak ma zwracać true,
jeżeli nie ma zwracać false.
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 8, 9, 3};
        System.out.println(contains(arr, 1));
    }

    public static boolean contains(int[] arr, int element) {
        boolean flag = false;
        for (int item : arr) {
            if (item == element) {
                flag = true;
            }
        }
        return flag;
    }

}