import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double num1;
        char op;
        double num2;
        double result;
        int check = 0;

        while(true){
            if(check==0){
                System.out.println("Enter the first number: ");
                num1 = input.nextDouble();
            }
            while(true){
            System.out.println("Enter the operator: ");
            op = input.next().charAt(0);
            
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == 'e' || op == 'E' || op == 'H' || op == 'h' || op == 'c' || op == 'C'){
                break;
            }
            else {
                System.out.println("Enter the right input: ");
            }
        }
            System.out.println("Enter the second number: ");
            num2 = input.nextDouble();
        
            switch(op){
                case '+' --> result = num1 + num2;
                case '-' --> result = num1 - num2;
                case '*' --> result = num1 * num2;
                case '/' --> result = num1 / num2;
            }

            System.out.println("Result: " + result);
            






}//while (true)
}//public main
}//public class
