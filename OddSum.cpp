#include <iostream>

int main() {
    int testcase;
    std::cin >> testcase;
    for (int i = 1; i <= testcase; i++) {
        int firstNumber, lastNumber;
        std::cin >> firstNumber >> lastNumber;
        int oddSum = 0;
        for (int j = firstNumber; j <= lastNumber; j++) {
            if (j % 2 == 1) {
                oddSum += j;
            }
        }
        std::cout << "Case " << i << ":" << " " << oddSum << std::endl;
    }
    return 0;
}
