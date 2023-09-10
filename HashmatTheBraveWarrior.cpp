#include <iostream>
#include <cmath>

int main() {
    long sizeOfHashmatsArmy, opponentsArmySize, absoluteDifference;
    while (std::cin >> sizeOfHashmatsArmy >> opponentsArmySize) {
        absoluteDifference = std::abs(sizeOfHashmatsArmy - opponentsArmySize);
        std::cout << absoluteDifference << std::endl;
    }
    return 0;
}
