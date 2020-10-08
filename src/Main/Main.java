package Main;

import java.util.Scanner;

/**class Main
 * @author Matteo Falkenberg
 * @version 1.20, 08.10.2020
 */

public class Main {


    public static boolean checkOp(String op){

        if(op.equals("addieren") || op.equals("+") || op.equals("subtrahieren") || op.equals("-") || op.equals("multiplizieren") || op.equals("*") || op.equals("dividieren") || op.equals("/")) {
            return true;
        }

        System.out.println("Ungültiger Operator");
        return false;
    }

    public static int calculate(String op, int num1, int num2){

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

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Wollen Sie 2 Zahlen: addieren (+), subtrahieren (-), multiplizieren (*) oder dividieren (/)?\n");

        String operator = sc.next();

        if(checkOp(operator) == false){
            System.exit(0);
        }

        System.out.println("Geben Sie 2 Werte ein, mit denen gerechnet werden soll.\n");

        try {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("Ergebnis: " + calculate(operator, num1, num2));
        }
        catch(Exception e) {
            System.out.println("Sie haben einen ungültigen Wert eingegeben!");
        }

    }

}
