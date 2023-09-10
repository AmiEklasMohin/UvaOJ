#include <iostream>
#include <cmath>

int main() {
    long sizeOfHashmatsArmy, sizeOfOpponentsArmy, absoluteDifference;
    while (std::cin >> sizeOfHashmatsArmy >> sizeOfOpponentsArmy) {
        absoluteDifference = std::abs(sizeOfHashmatsArmy - sizeOfOpponentsArmy);
        std::cout << absoluteDifference << std::endl;
    }
    return 0;
}
