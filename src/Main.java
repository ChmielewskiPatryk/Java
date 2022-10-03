//stwórz tablicę o nazwie numbers zawierającą 10 dowolnych liczb,
//stwórz zmienną tablicową reverse i umieść w niej elementy tablicy numbers w odwrotnej kolejności,
//wypisz na konsoli elementy z tablicy reverse.

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
     int[] numbers = {2,5,7,3,5,2,8,6,4,9};
     int[] reverse = new int[10];
        // nie wiem czy o to chodzilo ale dziala
     for (int i=0; i<10;i++){
      reverse[i]=numbers[9-i];
      System.out.print(reverse[i]+",");
     }
    }

}