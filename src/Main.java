
/*
uruchom program i zaobserwuj jaki wyjątek został rzucony,
zmodyfikuj kod tak, aby zabezpieczyć go przed rzuceniem wyjątku,
(zmodyfikuj kod tak, by w tym miejscu ten wyjątek nie był rzucany).
*/
public class Main {
    public static void main(String[] args) {
        showLength(null);
    }

    static void showLength(String s) {
        if (s != null) {
            System.out.println(s.length());
        }
    }

}

