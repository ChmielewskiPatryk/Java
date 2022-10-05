
/*
ustaw breakpoint w linii:
 b = i < 9995 ? a / i : a * i;
następnie uruchom program w trybie debugowania.
wznawiaj program kilka razy, a następnie go zatrzymaj,
zmodyfikuj breakpoint nadając mu warunek i<3,
debuguj ponownie program, do momentu wystąpienia wyjątku,
pozostaw program z błędem.
*/
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        for (int i = 1000; i >= 0; i--) {
            b = i < 9995 ? a / i : a * i;
        }
        System.out.println(b);

    }
}