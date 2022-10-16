import java.util.*;
public class clearRangeBit{
    public static int call(int n, int i, int j){
       int a = ((~0)<<(j+1));
       int b = (1<<i)-1;
       int bitMask = a | b;
       return n & bitMask;
    }
    public static void main(String args[]){
        System.out.println(call(10, 2, 4));
        System.out.println(call(16, 1, 6));
        System.out.println(call(28, 3, 5));
    }
}