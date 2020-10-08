package Main;

import java.util.Scanner;

/**class Main
 * @author Matteo Falkenberg
 * @version 1.20, 08.10.2020
 */

public class Main {


    public static boolean checkOp(String op){

        if(op.equals("addieren") || op.equals("+") || op.equals("subtrahieren") || op.equals("-") || op.equals("multiplizieren") || op.equals("*") || op.equals("dividieren") || op.equals("/") || op.equals("potenzieren") || op.equals("^")) {
            return true;
        }

        System.out.println("Ungültiger Operator");
        return false;
    }

    public static double calculate(String op, double num1, double num2){

        if(op.equals("addieren") || op.equals("+")){
            return (num1 + num2);
        }
        else if(op.equals("subtrahieren") || op.equals("-")){
            return (num1 - num2);
        }
        else if(op.equals("multiplizieren") || op.equals("*")){
            return (num1 * num2);
        }
        else if(op.equals("dividieren") || op.equals("/")){
            return (num1 / num2);
        }
        else if(op.equals("potenzieren") || op.equals("^")){
            return Math.pow(num1, num2);
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Wollen Sie 2 Zahlen: addieren (+), subtrahieren (-), multiplizieren (*), dividieren (/) oder potenzieren (^)?\n");

        String operator = sc.next();

        if(checkOp(operator) == false){
            System.exit(0);
        }

        System.out.println("Geben Sie 2 Werte ein, mit denen gerechnet werden soll.\n");

        try {
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            System.out.println("Ergebnis: " + calculate(operator, num1, num2));
        }
        catch(Exception e) {
            System.out.println("Sie haben einen ungültigen Wert eingegeben!");
        }

    }

}
