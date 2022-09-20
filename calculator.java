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
        int prevnex= 0;

        while (true) {
            if (check == 0) {
                System.out.println("Enter the first number: ");
                num1 = input.nextDouble();
            }
            while (true) {
                if (check == 0) {
                    System.out.println("Enter the operator: ");
                } else {
                    System.out.println("Enter the operator:  (C for clear, E for exit, H for history, P for previous, N for next)");
                }

                op = input.next().charAt(0);

                if (op == '+' || op == '-' || op == '*' || op == '/') {
                    break;

                }

                if (check > 0 && op == 'h' || op == 'H') {
                    for (int a = 0, i = 0; a < check; a++, i += 4) {
                        System.out.println(history.get(i) + " " + history.get(i + 1) + " " + history.get(i + 2) + " = "
                                + history.get(i + 3));

                    }

                    System.out.println("Enter the operator:  (C for clear, E for exit, H for history)");
                    op = input.next().charAt(0);
                } else if (op == 'P' || op == 'p' && check > 0){
                    System.out.println(history.get(prevnex*4-4) + " " + history.get(prevnex*4-3) + " " + history.get(prevnex*4-2) + " = " + history.get(prevnex*4-1));
                    prevnex--;
                    if(prevnex == 0){
                        System.out.println("No previous");
                    }
                }




                else if (op == 'c' || op == 'C') {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    check = 0;
                    continue;
                } else if (op == 'E' || op == 'e') {
                    break;
                }
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
            System.out.println("Result: ");
            System.out.printf("%.0f %c %.0f = %.0f\n\n", num1, op, num2, result);

            history.addElement(num1);
            history.addElement(op);
            history.addElement(num2);
            history.addElement(result);

            check++;
            prevnex++;
            num1 = result;

        } // while (true)
    }// public main
}// public class
