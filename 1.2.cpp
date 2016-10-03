#include <iostream>

using namespace std;
/**
This program reverses a null terminated string
**/
void reverse(char* str) {
    char *ch;
    ch = str;
    int j = strlen(str) -1;
    for (int i =0; i< j; i++) {
        char temp = *(ch +i);
        str[i] = *(ch +j);
        str[j] = temp;
        j--;
    }
}

int main()
{
    char ch[] = "rupehra";
    cout << "reverse(";
    cout << ch;
    cout << ") = ";
    reverse(&ch[0]);
    for (int i =0; i< strlen(ch); i++) {
        cout << ch[i];
    }
    cout << endl;
    return 0;
}
