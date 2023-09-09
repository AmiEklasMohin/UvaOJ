#include <iostream>
using namespace std;
int main() {
    string str;
    while (getline(cin, str)) {
        for (int i = 0; i < str.length(); i++) {
            int x = str[i] - 7;
            cout << (char)(x);
        }
        cout << endl;
    }
    return 0;
}
