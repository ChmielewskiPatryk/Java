//W pliku Main09.java napisz publiczną metodę factorial, która przyjmie jako parametr liczbę naturalną n.
//Metoda ma zwrócić wartość n!,czyli wynik mnożenia wszystkich liczb naturalnych w zakresie 1...n.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = factorial(num);
        System.out.println("Factorial:");
        System.out.println(result);
    }
    public static int factorial(int num){
        int res = 1;
        for(int i =1;i<=num;i++){
            res = res * i;
        }
        return res;
    }
}