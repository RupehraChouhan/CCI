import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        A = A.toLowerCase();
        String isPalindrome = "No";
        int j = A.length() - 1;
        for(int i=0; i< A.length(); i++){
            System.out.println(A.charAt(i) + " " + A.charAt(j));
            if (i == j) break;
            if(A.charAt(i)==(A.charAt(j))) {
                isPalindrome = "Yes";
                if(j-1 ==1) break;
            }
            else {
                isPalindrome = "No";
                break;
            }
            j--;
        }
        System.out.println(isPalindrome);
        /* Enter your code here. Print output to STDOUT. */
        
    }
}

// public class Solution {
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         String A=sc.next();
//         String R = new StringBuilder(A).reverse().toString();
        
//         if(A.equals(R)) System.out.println("Yes");
//         else System.out.println("No");
//     }
// }
