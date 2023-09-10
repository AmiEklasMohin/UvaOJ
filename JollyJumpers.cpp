#include <iostream>
#include <cmath>
#include <cstring>
using namespace std;

int main() {
    int n;
    while (cin >> n) {
        int arr[n];
        bool isJolly[n - 1];
        memset(isJolly, false, sizeof(isJolly));
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        if (n == 1) {
            cout << "Jolly" << endl;
            continue;
        }
        for (int i = 1; i < n; i++) {
            int k = abs(arr[i] - arr[i - 1]) - 1;
            if (k >= 0 && k < (n - 1)) {
                isJolly[k] = true;
            }
        }
        bool flag = true;
        for (int i = 0; i < (n - 1); i++) {
            if (!isJolly[i]) {
                cout << "Not jolly" << endl;
                flag = false;
                break;
            }
        }
        if (flag) {
            cout << "Jolly" << endl;
        }
    }
    return 0;
}
