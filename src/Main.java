import java.util.Arrays;

/*
Uzupełnij ciało metody tak, aby dla otrzymanej tablicy jej zawartość została skopiowana do tymczasowej tablicy, której rozmiar ma być 2-krotnie większy od tablicy podanej.
Uzupełnij brakujące elementy tymczasowej tablicy elementami tablicy pierwotnej w odwrotnej kolejności.
Metoda ma zwrócić skopiowaną i uzupełnioną tablicę. Przykład: dla tablicy int arr[] = {1,2,3}; ma zostać zwrócona tablica int arrTmp[] = {1,2,3,3,2,1};
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arrResult = append(arr);
        for(int item:arrResult){
            System.out.println(item);
        }

    }

    public static int[] append(int[] arr) {
        int length = arr.length;
        int[] arr2 = Arrays.copyOf(arr, 2 * length);
        for (int i=0;i<length;i++){
            arr2[length+i]=arr[length-i-1];
        }
        return arr2;

    }

}