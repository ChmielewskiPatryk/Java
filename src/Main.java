import java.util.Arrays;

//stwórz 10-elementową tablicę wypełnioną pojedynczą wartością "2". Tablica powinna wyglądać następująco:
// [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]
//zadanie wykonaj bez użycia pętli for.
public class Main {
    public static void main(String[] args) {
        System.out.println("Array:");
//        int[] arr = {2,2,2,2,2,2,2,2,2,2}; // chyba nie o to chodzi xD
        int[] arr = new int[10];
        Arrays.fill(arr, 2);


        for(int a : arr){
            System.out.print(a + " ");
        }

    }
}