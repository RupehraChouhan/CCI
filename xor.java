import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        long maxR = 0L;
        ArrayList<long> input = new ArrayList<long>();
        for(int a0 = 0; a0 < Q; a0++){
            long L = in.nextLong();
            long R = in.nextLong();
            input.add(L); input.add(R);
            if(R > maxR) maxR =R;
        }
        long[] arr = new long[maxR];
        arr[0] = 0L;
    }
}
