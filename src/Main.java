
/*
podzieli podany ciąg znaków na bohaterów z filmu Powrót do przyszłości – znakiem podziału jest przecinek (,),
wyświetli na konsoli każdego bohatera w oddzielnej linii.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(countTokens(" To jest tekst do "));
    }
    public static int countTokens(String str){
        String[] words = str.trim().split(" ");
        return words.length;
    }
}