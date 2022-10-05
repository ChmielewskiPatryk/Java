
/*
public static String encode(String str).
Uzupełnij ciało metody tak, by zwracała napis zaszyfrowany szyfrem Cezara.
*/
public class Main {
    public static void main(String[] args) {
        String encoded = encode("DupaZz", 2);
        System.out.println(encoded);
        String decoded = decode(encoded, 2);
        System.out.println(decoded);

    }

    public static String decode(String str, int shift) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                int uni = ((int) str.charAt(i) - shift - 65);
                if (uni < 0) {
                    uni = uni + 26;
                }
                char ch = (char) (uni % 26 + 65);
                res.append(ch);
            } else {
                int uni = ((int) str.charAt(i) - shift - 97);
                if (uni < 0) {
                    uni = uni + 26;
                }
                char ch = (char) (uni % 26 + 97);
                res.append(ch);
            }
        }
        String stringRes = res.toString();

        return stringRes;

    }


    public static String encode(String str, int shift) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                char ch = (char) (((int) str.charAt(i) + shift - 65) % 26 + 65);
                res.append(ch);
            } else {
                char ch = (char) (((int) str.charAt(i) + shift - 97) % 26 + 97);
                res.append(ch);
            }
        }
        String stringRes = res.toString();

        return stringRes;
    }


}