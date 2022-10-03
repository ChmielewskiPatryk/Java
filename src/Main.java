//W pliku Main06.java napisz publiczną metodę checkMaturity, która:
//przyjmie parametr liczbowy age oznaczający wiek użytkownika,
//sprawdzi, czy użytkownik jest pełnoletni,
//zwróci wartość true – jeśli jest pełnoletni,
//zwróci wartość false – jeśli nie jest.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Age:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean result = checkMaturity(age);
        System.out.println("Mature:");
        System.out.println(result);
    }
    public static boolean checkMaturity(int age){
        if(age>=18){
            return true;
        } else {
            return false;
        }

    }
}