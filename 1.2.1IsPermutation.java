import java.util.Arrays;
public class HelloWorld{

    public static boolean isPermutation(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
        char[] str1Chars = str1.toCharArray();
        char[] str2Chars = str2.toCharArray();
        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);
        String sortedStr1 = new String(str1Chars);
        String sortedStr2 = new String(str2Chars);
        if(sortedStr1.equals(sortedStr2)) return true;
        return false;
    }
        

    public static void main(String []args){
        String s1 = "dog";
        String s2 = "goD";
        boolean answer = isPermutation(s1, s2);
        if(answer)
            System.out.println(s1+ " is a permutation of "+ s2);
        else
            System.out.println(s1+ " is not a permutation of "+ s2);
    }
}
