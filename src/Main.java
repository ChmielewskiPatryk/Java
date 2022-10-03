//W pliku Main03.java napisz publiczną metodę convertToUsd,
//która przyjmuje parametr pln, czyli kwotę w złotówkach.
//Metoda ma zwrócić podaną kwotę w dolarach amerykańskich.
//Jako przelicznik przyjmij wartość 4.04 PLN = 1 USD.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type amount ZL to conver to USD:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double result = convertToUsd(number);
        System.out.println("Square:");
        System.out.println(result);
    }
    public static double convertToUsd(int num){
        double ratio =4.04;
        return num*ratio;
    }
}