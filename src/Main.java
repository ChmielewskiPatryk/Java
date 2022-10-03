//W pliku Main05.java napisz publiczną metodę calculateNetto, która przyjmie argumenty:
//gross: kwotę brutto ceny zakupu,
//vat: wartość podatku VAT. Możesz założyć, że VAT ma być liczbą zmiennoprzecinkową z zakresu 0 – 1.
//Metoda ma zwrócić wartość netto ceny. Napisz w komentarzu, jakie obliczenia musisz wykonać.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gross:");
        Scanner scanner = new Scanner(System.in);
        double gross = scanner.nextDouble();
        System.out.println("Vat:");
        Scanner scanner1 = new Scanner(System.in);
        double vat = scanner1.nextDouble();
        double result = calculateNetto(gross,vat);
        System.out.println("Netto:");
        System.out.println(result);
    }
    public static double calculateNetto(double gross, double vat){
        //gross = net + net*vat
        //gross = net(1+ vat)
        //net = gross/(1+vat)

        return (gross/(1+vat));
    }
}