#include <iostream>
#include <string>

int main() {
    std::string inputLine;
    int flag = 0;
    while (std::getline(std::cin, inputLine)) {
        std::string outputLine = "";
        for (int i = 0; i < inputLine.length(); i++) {
            if (inputLine[i] == '"' && flag == 0) {
                outputLine += "``";
                flag = 1;
            } else if (inputLine[i] == '"' && flag == 1) {
                outputLine += "''";
                flag = 0;
            } else {
                char add = inputLine[i];
                outputLine += add;
            }
        }
        std::cout << outputLine << std::endl;
    }
    return 0;
}
