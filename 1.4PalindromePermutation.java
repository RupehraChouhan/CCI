import java.math.*;

public class HelloWorld{

    public static String isPalindromePerm(String s) {
        //initialize countArray, charArray and an array for new palindrom
        int[] countArray = new int[128];
        char[] charArray = new char[128];
        char[] palindrome = new char[s.length()];
        String isPalindrome = "false";
        String str = s.toLowerCase();
        int totalSingleChars=0;
        int oddCharIndex = 0;
        
        //increment the count and assign the char in respective arrays
        for(int i =0; i<str.length(); i++) {
            countArray[(int)str.charAt(i)]++;
            charArray[(int)str.charAt(i)] = str.charAt(i);
            if(str.charAt(i) == ' ') {
                palindrome[i] = ' ';
                countArray[(int)str.charAt(i)]--;
            }
        }
        //Check if there is more one character with count = 1
        for (int i = 0; i< countArray.length; i++) {
            if(charArray[i]!= ' ' && (countArray[i] ==1 || countArray[i]%2 ==1)) totalSingleChars++;
        }
        if(totalSingleChars > 1) {return isPalindrome;}
        
        int a = 0, b = s.length()-1;
        //form a permutation if the count of character is even
        for(int i = 0; i<charArray.length; i++) {
            if(countArray[i] !=0 && countArray[i]%2 ==0 ) {
                while(countArray[i]!=0) {
                    if(palindrome[a] == ' ') a++;
                    if(palindrome[b] == ' ') b--;
                    palindrome[a] = charArray[i];
                    palindrome[b] = charArray[i];
                    a++; b--;
                    countArray[i] -= 2;
                }
            }
            else {
                if(countArray[i]!=0)
                    oddCharIndex = i;
            }
        }
        for(int i=0; i< palindrome.length; i++) {
            if((int)palindrome[i] == 0) 
                palindrome[i] = charArray[oddCharIndex];
                countArray[oddCharIndex]--;
        }
        String permutation = new String(palindrome);
        permutation = "True: (palindrome: '"+ permutation+"', etc. )";
        return permutation;
    }
    
    public static void main(String []args){
        String s = "Tact Coa";
        String palindrome = isPalindromePerm(s);
        System.out.println(palindrome);
    }
}
