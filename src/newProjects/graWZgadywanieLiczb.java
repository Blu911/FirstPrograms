package newProjects;

import java.util.Random;
import java.util.Scanner;

public class graWZgadywanieLiczb {
    public static void main(String[] args) {
        drawGame();
    }

    static void drawGame() {
        Random r = new Random();
        int a = r.nextInt(100) + 1;

        System.out.println("Hej witamy w grze: " + "Zgadnij liczbę :)\n" + "Zgadnij liczbę wylosowaną przez komputer. Liczba musi być od 0 - 100");
        System.out.println("Podaj liczbę");

        int counterPoints = 0;
        int number = 0;

        while (true) {
            number = isNumber();
            if (number > a) {
                System.out.println("Za dużo");
                counterPoints += 1;
            } else if (number < a) {
                System.out.println("Za mało");
                counterPoints += 1;
            } else {
                System.out.println("Gratulacje!");
                System.out.println("Zgadłeś za " + counterPoints + " razem! :)");
            }
        }
    }

    static int isNumber () {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Nieprawidłowa wartość, podaj liczbę: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}

