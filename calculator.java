import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double num1;
        char op= new char[10];
        double num2;
        double result;
        int check = 0;

        while(true){
            if(check==0){
                System.out.println("Enter the first number: ");
                num1 = input.nextDouble();
            }

            System.out.println("Enter the operator: ");
            op = input.next().charAt(0);




        }



    }
}
