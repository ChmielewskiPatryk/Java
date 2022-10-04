
/*
public static int charPos(String str, char c) .
Uzupełnij ciało metody tak, aby zwracała wartość pierwszego indeksu,
pod którym w napisie str znajduje się znak c.
*/
public class Main {

    public static void main(String[] args) {
        System.out.println(charPos("Dupa", 'p'));

    }

    static int charPos(String str, char c) {
        return str.indexOf(c);
    }
}