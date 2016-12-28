#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

//This program checks whether two strings are permutations of each other

bool is_Permutation( string str1,  string str2) {
    if (str1.length() != str2.length()) {
        return false;
    }
    sort(str1.begin(), str1.end());
    sort(str2.begin(), str2.end());
    if (str1 == str2) {
        return true;
    }
    return false;
}

int main() {
    string str1 = "abcd";
    string str2 = "abcd   ";
    bool is_perm = is_Permutation(str1, str2);
    if(is_perm == 1) {
        cout << str1 << " is a permutation of " << str2 << endl;
    }
    else {
        cout << str1 << " is not a permutation of " << str2 << endl;
    }
    return 0;
}
