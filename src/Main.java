
/*
podzieli podany ciąg znaków na bohaterów z filmu Powrót do przyszłości – znakiem podziału jest przecinek (,),
wyświetli na konsoli każdego bohatera w oddzielnej linii.
*/
public class Main {
    public static void main(String[] args) {

        String str = "Bohater1, Bohater2, Bohater3, Bohater4, Bohater5";
        String[] splitted = str.split(",");
        for(String item :splitted){
            System.out.println(item.trim());
        }
    }
}