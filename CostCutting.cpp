#include <iostream>
#include <algorithm>
using namespace std;
int main() {
    int testcase;
    cin >> testcase;
    for (int i = 1; i <= testcase; i++) {
        int arr[3];
        for (int j = 0; j < 3; j++) {
            cin >> arr[j];
        }
        sort(arr, arr + 3);
        cout << "Case " << i << ":" << " " << arr[1] << endl;
    }
    return 0;
}