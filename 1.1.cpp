#include <iostream>
#include <vector>

using namespace std;
/**
This program checks whether a string a unique characters
**/
bool isUniqueString(string str) {
    if (str.length() > 256) {
        return false;
    }
    vector<int> char_vector;
    for (int i =0 ;i < 256; i++) {
        char_vector.push_back(0);
    }
    string::iterator it;
    bool unique = true;
    for (it = str.begin(); it<str.end(); ++it) {
        char ch = *it;
        if (char_vector.at(int(ch))==0){
            char_vector[int(ch)] = 1;
        }
        else {
            unique = false;
            break;
        }
    }
    return unique;
}

int main()
{
   int are_chars_unique = isUniqueString("rupehra");
   if (are_chars_unique == 0) {
      cout << "Characters in the string are not unique" << endl;
   }
   else {
        cout << "Characters in the string are unique" << endl;
   }
   return 0;
}
