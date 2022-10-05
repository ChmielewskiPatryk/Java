
/*
uruchom program i zaobserwuj jaki wyjątek został rzucony,
zmodyfikuj kod tak, aby zabezpieczyć go przed rzuceniem wyjątku,
(zmodyfikuj kod tak, by w tym miejscu ten wyjątek nie był rzucany).
*/
public class Main {
    public static void main(String[] args) {
        try{
            showLength(null);
        }catch(NullPointerException e){
            System.out.println("Can show lenght of NULL");
        }
    }

    static void showLength(String s) {
            System.out.println(s.length());

    }

}

