public class HelloWorld{

    public static String urlify(String s, int len) {
        char[] charArray = new char[len*2];
        s = s.trim();
        System.out.println(s);
        int j = 0;
        for(int i =0; i<len; i++) {
            if(s.charAt(i)==' ') {
                System.out.println("yes");
               charArray[j] = '%';
               charArray[j+1] = '2';
               charArray[j+2] = '0';
               j+=3;
            } else {
            charArray[j] = s.charAt(i);
            j++;
            }
        }
        String newStr = new String(charArray);
        return newStr;
    }
    
    public static void main(String []args){
        String s = "Mr John Smith   ";
        int length = 13;
        String newStr = urlify(s, length);
        System.out.println(newStr);
    }
}
