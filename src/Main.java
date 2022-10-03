//stwórz 50-elementową tablicę o nazwie mainTab z kolejnymi liczbami całkowitymi od 0 do 49,
//wypisz na konsoli po kolei elementy tej tablicy, po dziesięć w każdym wierszu,
//liczby jednocyfrowe uzupełnij dodatkowym zerem na początku (np. 03).
public class Main {
    public static void main(String[] args) {
        System.out.println("Array:");
        int[] numbers = new int[50];
        for(int i=0; i<50; i++){

            numbers[i] = i+1;
            if(numbers[i]<10){

                System.out.print("0"+numbers[i] + " ");
            }else{
                System.out.print(numbers[i] + " ");
            }
            if(numbers[i] % 10 == 0){
                System.out.println("");
            }
        }

    }

}