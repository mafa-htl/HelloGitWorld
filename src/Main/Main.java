package Main;

import java.util.Scanner;

/**class Main
 * @author Matteo Falkenberg
 * @version 1.20, 08.10.2020
 */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie 2 Werte ein, die miteinander addiert werden sollen.\n");

        try {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("Ergebnis: "+ (num1 + num2));
        }
        catch(Exception e) {
            System.out.println("Sie haben einen ungültigen Wert eingegeben!");
        }

    }

}
