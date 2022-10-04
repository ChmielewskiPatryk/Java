
/*
Palindrom to słowo lub zdanie, które brzmi tak samo zarówno czytane wspak, jak i od początku, np.: "kajak", "radar", "Kobyła ma mały bok".
W pliku Main07.java napisz program, który sprawdzi, czy zmienna str, umieszczona w klasie, jest palindromem.
Uwaga: podczas sprawdzania palindromu zignoruj spacje.
*/
public class Main {
    public static void main(String[] args) {
        String str = "A to kanapa pana kota";
        String lowerCase = str.toLowerCase();
        String joinStr = lowerCase.replaceAll("\\s+", "");
        char[] strArr = joinStr.toCharArray();
        int length = strArr.length;
        char[] reverseArr = new char[length];
        for (int i = 0; i < length; i++) {
            reverseArr[i] = strArr[length - 1 - i];
        }
        String reversedStr = String.valueOf(reverseArr);
        System.out.println(joinStr.equals(reversedStr));
    }
}