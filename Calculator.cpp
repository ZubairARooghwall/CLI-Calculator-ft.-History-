#include <iostream>
#include <vector>
#include <stdio.h>
#include <string.h>

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

        while (true)
        {
            std::cout << "Enter the operator: (C for clear, E for exit, H for history, P\n";
            std::cin >> op;

            if (op == '+' || op == '-' || op == '*' || op == '/')
            {
                break;
            }
            else if (counter > 0 && op == 'h' || op == 'H')
            {
                for (int a = 0, i = 0; a < counter; a++, i += 4)
                    std::cout << history.at(i) << " " << double(history.at(i + 1)) << " " << history.at(i + 2) << " = " << history.at(i + 3) << "\n";
            }
        }
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

        history.push_back(num1);
        history.push_back(op);
        history.push_back(num2);
        history.push_back(result);

        counter++;
        num1 = result;
    }
}