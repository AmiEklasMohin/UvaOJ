#include <iostream>
#include <cmath>
using namespace std;

int main() {
    long sizeOfHashmatsArmy, opponentsArmySize, absoluteDifference;
    while (cin >> sizeOfHashmatsArmy >> opponentsArmySize) {
        absoluteDifference = abs(sizeOfHashmatsArmy - opponentsArmySize);
        cout << absoluteDifference << endl;
    }
    return 0;
}
