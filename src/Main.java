
/*
podzieli na wyrazy ciąg znaków przechowywany w zmiennej str, znajdującej się w pliku,
wyświetli na konsoli każdy z tych wyrazów w oddzielnej linii.
*/
public class Main {
    public static void main(String[] args) {
        String str = "Naucz się programować od podstaw i rozwiń wymarzoną karierę w branży IT.";
        String[] strSplitted = str.split(" ");
        for(String stri : strSplitted){
            System.out.println(stri);
        }
    }
}