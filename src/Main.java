//W pliku Main04.java napisz publiczną metodę createName, która przyjmie następujące parametry:
//name: imię,
//surname: nazwisko,
//nickname: pseudonim.
//Metoda ma zwrócić łańcuch tekstowy z połączonymi parametrami, w postaci: "imię pseudonim nazwisko".
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Surname:");
        Scanner scanner1 = new Scanner(System.in);
        String surname = scanner1.nextLine();
        System.out.println("Nickname:");
        Scanner scanner2 = new Scanner(System.in);
        String nickname = scanner2.nextLine();
        String result = createName(name,surname,nickname);
        System.out.println("Joined string:");
        System.out.println(result);
    }
    public static String createName(String name, String surname, String nickname){
        return (name + " " + nickname + " " + surname);
    }
}