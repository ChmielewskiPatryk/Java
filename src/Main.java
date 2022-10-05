
/*
public static String encode(String str).
Uzupełnij ciało metody tak, by zwracała napis zaszyfrowany szyfrem Cezara.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(encode("Dupa"));
    }

    public static String encode(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
            {
                char ch = (char)(((int)str.charAt(i) +
                        1 - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)str.charAt(i) +
                        1 - 97) % 26 + 97);
                result.append(ch);
            }
        }
        String stringRes = result.toString();

        return stringRes;
    }


}