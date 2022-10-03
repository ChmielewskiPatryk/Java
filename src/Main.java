//stwórz tablicę o nazwie numbers zawierającą 10 dowolnych liczb,
//stwórz drugą tablicę, nazwij ją secondNumbers, wypełnij 10 dowolnymi liczbami,
//stwórz trzecią tablicę zawierającą sumy elementów, które mają w tablicach pozycję o tym samym indeksie.
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 7, 3, 5, 2, 8, 6, 4, 9};
        int[] secondNumbers = {6, 8, 3, 9, 5, 4, 2, 1, 4, 5};
        int[] thirdNumbers = new int[10];
        // dziala ale nie wiem czy tu chca jakies Array methods?
        for (int i =0; i<10;i++){
            thirdNumbers[i]=numbers[i]+secondNumbers[i];
            System.out.print(thirdNumbers[i]+",");
        }
    }
}