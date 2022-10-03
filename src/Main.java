import java.util.Arrays;

//stwórz tablicę o nazwie randNumbers
//przy użyciu pętli for wypełnij tablicę przez 20 losowych liczb z zakresu 0-100, (do otrzymania losowej wartości użyj sposobu opisanego w snippetach),
//wypisz w konsoli minimalną wartość z tablicy.
public class Main {
    public static void main(String[] args) {
        System.out.println("Array:");
        int min = 100;       //rozwiazanie 1
        int min2;            //rozwiazanie 2
        int[] randNumbers = new int[20];
        for(int i=0; i<randNumbers.length;i++){
            randNumbers[i] = (int)(Math.random()*101);
            min = Math.min(randNumbers[i],min);  //rozwiazanie 1
        }
        System.out.println(min);   //rozwiazanie 1



        Arrays.sort(randNumbers); //rozwiazanie 2
        System.out.println(randNumbers[0]); //rozwiazanie 2

    }

}