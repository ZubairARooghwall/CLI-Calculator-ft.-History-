import java.util.Scanner;
import java.util.Vector;

public class calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1 = 0;
        char op;
        double num2 = 0;
        double result = 0;
        int check = 0;
        Vector history = new Vector();

        while (true) {
            if (check == 0) {
                System.out.println("Enter the first number: ");
                num1 = input.nextDouble();
            }
            while (true) {
                if (check == 0) {
                    System.out.println("Enter the operator: ");
                } else {
                    System.out.println("Enter the operator:  (C for clear, E for exit, H for history)");
                }

                op = input.next().charAt(0);

                if (op == '+' || op == '-' || op == '*' || op == '/' || op == 'e' || op == 'E' || op == 'H' || op == 'h'
                        || op == 'c' || op == 'C') {
                    break;
                } else {
                    System.out.println("Enter the right input: ");
                }
            }

            if (check > 0 && op == 'h' || op == 'H') {
                for (int a = 0, i = 0; a < check; a++, i += 4) {
                    System.out.println(history.get(i) + " " + history.get(i + 1) + " " + history.get(i + 2) + " = "
                            + history.get(i + 3));

                }

                System.out.println("Enter the operator:  (C for clear, E for exit, H for history)");
                op = input.next().charAt(0);
            } else if (op == 'c' || op == 'C') {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Enter the operator:  (C for clear, E for exit, H for history)");
                op = input.next().charAt(0);
            } else if (op == 'E' || op == 'e') {
                break;
            }

            System.out.println("Enter the second number: ");
            num2 = input.nextDouble();

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    result = num1 / num2;
                    break;

            }

            System.out.println("Result: " + result);

            history.addElement(num1);
            history.addElement(op);
            history.addElement(num2);
            history.addElement(result);

            check++;
            num1 = result;

        } // while (true)
    }// public main
}// public class
