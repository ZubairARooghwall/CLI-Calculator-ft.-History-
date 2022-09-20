#include <iostream>
#include <vector>
int main()
{
    double num1, num2, result;
    char op;
    std::vector<double> history;
    int counter;

    while (true)
    {
        if (counter == 0)
        {
            std::cout << "Enter the first number: \n";
            std::cin >> num1;
        }

        std::cout << "Enter the operator: (C for clear, E for exit, H for history, P\n";
        std::cin >> op;

        std::cout << "Enter the second number: \n\n";
        std::cin >> num2;

        switch (op)
        {
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
        std::cout << "Result: \n";
        std::cout << num1 << " " << op << " " << num2 << " = " << result << "\n\n";

        counter++;
        num1 = result;
    }
}