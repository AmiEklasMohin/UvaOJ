#include <iostream>
#include <algorithm>

int main() {
    int testcase, salaryList[3];
    std::cin >> testcase;
    for (int i = 1; i <= testcase; i++) {
        for (int j = 0; j < 3; j++) {
            std::cin >> salaryList[j];
        }
        std::sort(salaryList, salaryList + 3);
        std::cout << "Case " << i << ":" << " " << salaryList[1] << std::endl;
    }
    return 0;
}
