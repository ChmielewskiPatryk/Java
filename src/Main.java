//W pliku Main08.java napisz publiczną metodę maxOfThree,
// która przyjmie trzy parametry liczbowe. Metoda ma zwrócić największą liczbę.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Number 1:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Number 2:");
        Scanner scanner2 = new Scanner(System.in);
        int num2 = scanner2.nextInt();
        System.out.println("Number 3:");
        Scanner scanner3 = new Scanner(System.in);
        int num3 = scanner3.nextInt();
        int result = maxOfThree(num1, num2, num3);
        System.out.println("Number is:");
        System.out.println(result);
    }
    public static int maxOfThree(int num1,int num2,int num3){
        int max= Math.max(num1,num2);
        return Math.max(max,num3);

    }
}