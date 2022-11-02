
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {

    static Boolean isTakeTestCase=false;
    Map<String,Boolean> hashmap;
    FastScanner scanner;
    Main(){
        hashmap=new HashMap<>();
        scanner=new FastScanner();
        int limit=(int)1e5;
        for(int i=0;i<limit;i++){
            hashmap.put(String.valueOf((int)(i*8)),true);
        }
    }
    public static void main(String[] args) {

        Printer.out=new PrintWriter(System.out);
        //driver start
        //Solution solution=new Solution(s);
//        long t=1;
//        if(isTakeTestCase){
//            t=scanner.nextLong();
//        }
//        while(t>0){
//            t--;
//            solve();
//        }
        Main solution=new Main();
        solution.solve();

        // driver end
        Printer.out.close();
    }

    void solve(){
        String s=scanner.next();
        boolean isEightDivisible=false;
        final String[] ans = {"-1"};
        hashmap.forEach((key,b)->{
            int last=-1;
            for(int i=0;i<key.length();i++){
                char c=key.charAt(i);
                last=s.indexOf(c,last+1);
                if(last==-1){
                    break;
                }
            }
            if(last != -1){
                ans[0] =key;
                return;
            }
        });
        isEightDivisible=(ans[0].equals("-1")==false);
        Printer.printlnYESNO(isEightDivisible);
        if(isEightDivisible) Printer.println(ans[0]);
    }

}

class Solution{
    static FastScanner scanner;
    Solution(FastScanner scanner){
        this.scanner=scanner;
    }
    public void solve(){

    }
}
class FastScanner {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer("");
    public String next() {
        while (!st.hasMoreTokens())
            try {
                st=new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }
    public int[] readIntArray(int n) {
        int[] a=new int[n];
        for (int i=0; i<n; i++) a[i]=nextInt();
        return a;
    }
    public long[] readLongArray(int n) {
        long[] a=new long[n];
        for (int i=0; i<n; i++) a[i]=nextLong();
        return a;
    }
    public long nextLong() {
        return Long.parseLong(next());
    }
}
class Printer{
    public static PrintWriter out;
    public static void print(Object o1){
        out.print(o1+" ");
    }
    public static void print(Object o1,Object o2){
        out.print(o1+" "+o2+" ");
    }
    public static void print(Object o1,Object o2,Object o3){
        out.print(o1+" "+o2+" "+o3+" ");
    }
    public static void print(Object o1,Object o2,Object o3,Object o4){
        out.print(o1+" "+o2+" "+o3+" "+o4+" ");
    }
    public static void printList(ArrayList<?> lst){
        lst.forEach((elem)->print(elem));
    }
    public static void printLongArray(long []arr,int n){
        for(int i=0;i<n;i++) print(arr[i]);
    }
    public static void printReject(){
        print(-1);
    }
    public static void printYESNO(boolean b){
        if(b) print("YES");
        else print("NO");
    }
    public static void printYesNo(boolean b){
        if(b) print("Yes");
        else print("No");
    }
    public static void printyesno(boolean b){
        if(b) print("yes");
        else print("no");
    }

    public static void println(){
        out.println();
    }
    public static void println(Object o1){
        out.println(o1);
    }
    public static void println(Object o1,Object o2){
        out.println(o1+" "+o2);
    }
    public static void println(Object o1,Object o2,Object o3){
        out.println(o1+" "+o2+" "+o3);
    }
    public static void println(Object o1,Object o2,Object o3,Object o4){
        out.println(o1+" "+o2+" "+o3+" "+o4);
    }
    public static void printlnList(ArrayList<?> lst){
        printList(lst);
        println();
    }
    public static void printlnLongArray(long []arr,int n){
        printLongArray(arr,n);
        println();
    }
    public static void printlnYESNO(boolean b){
        printYESNO(b);
        println();
    }
    public static void printlnYesNo(boolean b){
        printYesNo(b);
        println();
    }
    public static void printlnyesno(boolean b){
        printyesno(b);
        println();
    }
    public static void printlnReject(){
        printReject();
        println();
    }
}

