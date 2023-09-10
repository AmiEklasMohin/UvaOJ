#include <iostream>
#include <string>

int main() {
    std::string encodedLine;
    while (std::getline(std::cin, encodedLine)) {
        std::string decodedLine = "";
        for (int i = 0; i < encodedLine.length(); i++) {
            int x = encodedLine[i] - 7;
            decodedLine += (char) x;
        }
        std::cout << decodedLine << std::endl;
    }
    return 0;
}
