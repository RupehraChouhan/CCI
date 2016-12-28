#include <iostream>
#include <string>
using namespace std;

//This programs replaces some certain charachters in a string with something else
string replace_space(string str, string replace) {

    int length  = str.length();
    for(int i = 0; i < length ;i++) {
        if (str[i] == ' ') {
            str.replace(i,1, replace);
        }
    }
    return str;
}

int main() {

    string str;
    string replace_with;
    cout << "Enter the string: ";
    getline (cin, str);
    cout << "What do you want to replace with space: ";
    getline(cin, replace_with);
    string new_str = replace_space(str, replace_with);
    cout << "\n" << new_str << endl;
    return 0;
}
