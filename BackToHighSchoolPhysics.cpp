#include <iostream>

int main() {
    int givenVelocity, givenTime, displacementInDoubleTime;
    while (std::cin >> givenVelocity >> givenTime) {
        displacementInDoubleTime = 2 * givenVelocity * givenTime;
        std::cout << displacementInDoubleTime << std::endl;
    }
    return 0;
}
