//W pliku Main01.java napisz metodę o sygnaturze:
//public static int multiply(int multiplier, int index),
//która zwróci wartość zmiennej multiplier pomnożonej przez wartość argumentu index.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type multipier:");
        Scanner scanner = new Scanner(System.in);
        int multiplier = scanner.nextInt();
        System.out.println("Type index:");
        Scanner scanner1 = new Scanner(System.in);
        int index = scanner1.nextInt();
        int result = multiply(multiplier,index);
        System.out.println(result);
    }
    public static int multiply(int multiplier, int index){
        return multiplier*index;
    }
}