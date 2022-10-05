
/*
uruchom program i zaobserwuj jaki wyjątek został rzucony,
dodaj do kodu obsługę odpowiedniego wyjątku i uruchom ponownie program,
zwróć uwagę czy jest to wyjątek kontrolowany, czy niekontrolowany i dlaczego.
*/
public class Main {
    public static void main(String[] args) {
        int[] tab = {  5, 1, 6, 7, 8 } ;
        try {
            System.out.println(tab[21]);
        } catch (ArrayIndexOutOfBoundsException e){
            //wyjatek niekontrolowalny bo nie trzeba go obslugiwac ale mozna
            System.out.println("Table is not so long ");
        }

    }
}