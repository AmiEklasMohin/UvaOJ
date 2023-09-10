#include <iostream>
using namespace std;

int main() {
    int testCase;
    cin >> testCase;
    for (int i = 1; i <= testCase; i++) {
        int a, b;
        cin >> a >> b;
        if (a > b) {
            cout << ">" << endl;
        } else if (a < b) {
            cout << "<" << endl;
        } else {
            cout << "=" << endl;
        }
    }
    return 0;
}
