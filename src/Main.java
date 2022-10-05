
/*
W pliku Main01.java została umieszczona metoda o sygnaturze: public static int factorial(int number)
zwracająca silnię liczby naturalnej przekazanej w parametrze.
zmodyfikuj kod tak, aby metoda zwracała wyjątek IllegalArgumentException w sytuacji, gdy liczba number przekazana w parametrze będzie mniejsza od zera,
zwróć uwagę czy jest to wyjątek kontrolowany czy niekontrolowany i dlaczego,
przetestuj działanie programu wywołując metodę factorial z poprawnym i z niepoprawnym parametrem,
przy wywołaniu metody factorial dodaj obsługę wyjątku IllegalArgumentException,
przetestuj ponownie działanie programu.
*/
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(factorial(-1));
        } catch (IllegalArgumentException e) {
            System.out.println("Input can not but an negative number");
        }
    }

    static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        } else {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }
}