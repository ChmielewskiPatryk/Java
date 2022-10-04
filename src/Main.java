
/*
public static int tripple(String str)

Metoda zwraca ilość potrójnych wystąpień znaków w napisie
Przykład dla qazbbbwsx -> 1, dla aaawsxbbb ->2
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(tripple("aaawsxbbb"));
        System.out.println(tripple("qazbbbwsx"));
    }

    public static int tripple(String str) {
        int len = str.length();
        int count = 0;

        for (int i = 0; i < len - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2)) {
                count++;
            }
        }
        return count;
    }


}