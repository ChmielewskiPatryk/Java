import java.util.Arrays;

/*
public static int[] returnUnique(int[] arr).
Uzupełnij ciało metody w taki sposób by z tablicy arr wybrała tylko unikalne wartości,
które następnie mają być zwrócone z metody.
Przykład dla tablicy [1,1,2,3,3,4], powinniśmy otrzymać [1,2,3,4].
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 1, 2, 3, 3, 4};
        for (int item : returnUnique(arr)) {
            System.out.println(item);
        }
    }
// Tu mam raczej przekombinowane
    public static int[] returnUnique(int[] arr) {
        Arrays.sort(arr);
        int newArrLength = 1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i + 1]) {
                newArrLength += 1;
            }
        }
        int[] newArr = new int[newArrLength];
        int count = 1;
        for (int i = 0; i < arr.length-1; i++) {
            newArr[0] = arr[0];
            if (arr[i] != arr[i + 1]) {
                newArr[count] = arr[i+1];
                count++;
            }
        }
        return newArr;
    }

}