
/*
public static String censor(String str, String[] words).
Metoda:
rozbije łańcuch tekstowy na tablicę wyrazów,
sprawdzi, czy nie znajdują się w nim słowa niedozwolone zawarte w tablicy words,
jeśli tak -- zamieni je na cztery gwiazdki (****)
ponownie połączy tablicę w string i zwróci wartość.
*/
public class Main {
    public static void main(String[] args) {
        String[] words = {"dupa", "kurwa"};
        System.out.println(censor("O zesz kurwa dziala elegancko dupa", words));
    }

    public static String censor(String str, String[] words) {
        String[] wordsArr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordsArr.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (wordsArr[i].equals(words[j])) {
                    wordsArr[i] = "****";
                }
            }
            sb.append(wordsArr[i]);
            sb.append(" ");
        }
        String res = sb.toString().trim();


        return res;
    }
}