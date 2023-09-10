#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int i, j;
    while (cin >> i >> j) {
        int a = i, b = j;
        int maxCycleLength = 0;
        if (i > j) {
            int temp = i;
            i = j;
            j = temp;
        }
        for (int x = i; x <= j; x++) {
            int temp = x, count = 1;
            while (temp != 1) {
                if (temp % 2 == 0) {
                    temp = temp / 2;
                } else {
                    temp = (temp * 3) + 1;
                }
                count += 1;
            }
            maxCycleLength = max(maxCycleLength, count);
        }
        cout << a << " " << b << " " << maxCycleLength << endl;
    }
    return 0;
}
