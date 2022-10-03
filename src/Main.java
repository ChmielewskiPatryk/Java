//Zadanie 10* (Dodatkowe)
//Gdy klub piłkarski A gra dwumecz z klubem piłkarskim B, oznacza to, że grają jeden mecz na boisku drużyny A i jeden na boisku drużyny B.
//Wygrywa ta drużyna, która zdobędzie więcej goli w obu meczach.
//W przypadku, gdy drużyny zdobyły tyle samo bramek, gole zdobyte na wyjeździe liczą się jako "trochę ważniejsze" i wygrywa ta drużyna, która zdobyła więcej bramek na wyjeździe.
//Remis w dwumeczu wypada wtedy, gdy obie drużyny zdobyły tyle samo bramek i mają tyle samo bramek na wyjeździe.

//Na przykład:
//W Pucharze Polski grają dwa zespoły: Grom i Błyskawica. Zespoły rozegrały następujące mecze:
//Gospodarz: Grom.
//Grom 0:2 Błyskawica
//Gospodarz: Błyskawica.
//Błyskawica 1:3 Grom
//Sumaryczny wynik dwumeczu wynosi 3:3. Jednak Grom na wyjeździe zdobył 3 bramki, a Błyskawica tylko 2. Zatem wygrywa Grom.
//Napisz metodę, footballWin, która przyjmie następujące parametry:
//gole zdobyte przez zespół A w pierwszym meczu (na boisku zepołu A),
//gole zdobyte przez zespół B w pierwszym meczu (na boisku zepołu A),
//gole zdobyte przez zespół A w drugim meczu (na boisku zespołu B),
//gole zdobyte przez zespół B w drugim meczu (na boisku zespołu B),
//po czym zwróci 1, jeśli dwumecz wygrał zespół A, 2 – jeśli B. W przypadku remisu, zwróć X. Wynik ma być łańcuchem tekstowym, a nie liczbą!
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pitch A Goals TEAM A:");
        Scanner scanner = new Scanner(System.in);
        int AGolsA = scanner.nextInt();
        System.out.println("Pitch A Goals TEAM B:");
        Scanner scanner1 = new Scanner(System.in);
        int AGolsB = scanner1.nextInt();
        System.out.println("Pitch B Goals TEAM A:");
        Scanner scanner2 = new Scanner(System.in);
        int BGolsA = scanner2.nextInt();
        System.out.println("Pitch B Goals TEAM B:");
        Scanner scanner3 = new Scanner(System.in);
        int BGolsB = scanner3.nextInt();
        String result = footballWin(AGolsA,AGolsB,BGolsA,BGolsB);
        System.out.println("Winner team is:");
        System.out.println(result);
    }
    public static String footballWin(int AGolsA,int AGolsB,int BGolsA,int BGolsB){
        int teamAScore =0;
        int teamBScore =0;
        String winner ="";

        if(AGolsA>AGolsB){
            teamAScore =+1;
        } else if (AGolsA<AGolsB) {
            teamBScore =+1;
        }
        if(BGolsA>BGolsB){
            teamAScore =+1;
        } else if (BGolsA<BGolsB) {
            teamBScore =+1;
        }

        if(teamAScore>teamBScore){
            winner = "1";
        } else if (teamAScore<teamBScore) {
            winner = "2";
        } else if (teamAScore == teamBScore) {
            int pointsTeamA = AGolsA + BGolsA * 2;
            int pointsTeamB = BGolsA * 2 + BGolsB;
            if (pointsTeamA > pointsTeamB) {
                winner = "1";
            } else if (pointsTeamA < pointsTeamB) {
                winner = "2";
            } else if (pointsTeamA == pointsTeamB) {
                winner = "x";
            }
        }
        else {
            winner = "Cos jest zjebane"; // nie powinno nigdy się zdazyc
        }
        return winner;
    }
}