//W pliku Main02.java napisz metodę o sygnaturze:
//public static int square(int num),
//która zwróci wartość num podniesioną do kwadratu.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = square(number);
        System.out.println("Square:");
        System.out.println(result);
    }
    public static int square(int num){
        return num*num;
    }
}