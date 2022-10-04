/*
W pakiecie pl.coderslab.homeworks.methods,
w pliku Main02.java umieść metodę o sygnaturze public static boolean divisibleBy(int a, int b ):
Uzupełnij ciało metody tak, aby zwracała true bądź false w zależności czy zmienna a jest podzielna przez b.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(divisibleBy(10,2));
        System.out.println(divisibleBy(10,3));
    }
    public static boolean divisibleBy(int a, int b ){
        if(a%b == 0){
            return true;
        }else{
            return false;
        }
    }

}