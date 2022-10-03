//W pliku Main07.java napisz publiczną metodę checkEvenOdd, która:
//przyjmie parametr liczbowy number,
//będzie zwracać wartość typu String,
//zwróci wynik "even", jeśli liczba jest parzysta,
//zwróci wynik "odd", jeśli liczba jest nieparzysta.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = checkEvenOdd(number);
        System.out.println("Number is:");
        System.out.println(result);
    }
    public static String checkEvenOdd(int number){
        if(number%2 == 0){
            return "even";
        } else {
            return "odd";
        }

    }
}