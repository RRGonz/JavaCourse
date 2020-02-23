package exercises;

import java.util.Scanner;
/**
 * Simule un juego el cual consiste en adivinar un número.
 * debe pedir un número N y luego ir pidiendo número
 * indicando “mayor” o “menor” según sea mayor o menor con
 * respecto a N. el proceso termina cuando el usuario acierta.
 *
 * @author Rommel Ramses Gonzalez Torrez
 */
public class GuessGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n, num = 0;
        n = (int) (Math.random() * 100) + 1;
        try {
            System.out.print("Guess the number: ");
            num = scn.nextInt();
        } catch (Exception e) {
            System.out.println("You must necessarily enter an integer.");
            scn.next();
        }

        while (num != n) // mientras no coincidan ambos números
        {
            if (num > n) {
                System.out.println("menor");
            } else {
                System.out.println("mayor");
            }
            try {
                System.out.print("Guess the number: ");
                num = scn.nextInt();
            } catch (Exception e) {
                System.out.println("You must necessarily enter an integer.");
                scn.next();
            }
        }
        scn.close();
        System.out.println("Acertaste...");
    }
}