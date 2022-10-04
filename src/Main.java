//W pakiecie pl.coderslab.homeworks.methods, w pliku Main01.java umieść metodę o sygnaturze public static double dogAge(double dogAge) , która przeliczy wiek psa w psich latach.
//funkcja powinna przyjmować wiek psa jako parametr,
//dla pierwszych dwóch lat, każdy rok życia psa jest równy 10.5 ludzkiego roku,
//powyżej dwóch lat, każdy rok życia psa, to 4 ludzkie lata,
//funkcja powinna zwrócić wiek psa w przeliczeniu na lata ludzkie.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(dogAge(1.5));
        System.out.println(dogAge(5));
    }
    public static double dogAge(double dogAge){
        double realAge;
        if(dogAge<=2){
            realAge = dogAge*10.5;
        }else{
            realAge = 2*10.5 + (dogAge-2)*4;
        }
        return  realAge;
    }

}