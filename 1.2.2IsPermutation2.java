import java.util.Arrays;
import java.util.HashMap; 

public class HelloWorld{

    public static boolean isPermutation(String str1, String str2) {
        
        int[] letters = new int[128];
        for(int i = 0; i < str1.length(); i++) {
            letters[str1.charAt(i)]++;
        }
        for(int i=0; i<str2.length(); i++) {
            letters[str2.charAt(i)]--;
            if(letters[str2.charAt(i)] < 0) return false;
        }
        return true;
    }

    public static void main(String []args){
        String s1 = "aabc";
        String s2 = "abac";
        boolean answer = isPermutation(s1, s2);
        if(answer)
            System.out.println(s1+ " is a permutation of "+ s2);
        else
            System.out.println(s1+ " is not a permutation of "+ s2);
    }
}
