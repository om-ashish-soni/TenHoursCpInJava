
import com.library.algo.BinarySearch;
import com.library.conversion.Convertor;
import com.library.mathlib.ChineseRemainder;
import com.library.mathlib.Factorization;

import java.util.*;
import java.io.*;

public class Main {

    static Boolean isTakeTestCase=false;
    Map<String,Boolean> hashmap;
    FastScanner scanner;
    Main(){
        hashmap=new HashMap<>();
        scanner=new FastScanner();
    }
    public static void main(String[] args) throws Exception {

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

    void solve() throws Exception {

        int num[] = { 3, 5, 10 };
        int rem[] = { 2, 3, 1 };
        ArrayList<Integer> lst=new ArrayList<Integer>();
        lst.add(3);
        lst.add(5);
        lst.add(10);
        int index= BinarySearch.lowerBound(lst,3);
        Printer.print("index : "+index);
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
    public long nextLong() {
        return Long.parseLong(next());
    }
    public String nextLine() throws IOException { return br.readLine();}
    public int [] nextIntArray(int n){
        int [] arr=new int[n];
        readIntArray(arr);
        return arr;
    }
    public long [] nextLongArray(int n){
        long [] arr=new long[n];
        readLongArray(arr);
        return arr;
    }
    public void readIntArray(int arr[]) {
        for (int i=0; i<arr.length; i++) arr[i]=nextInt();
    }
    public void readLongArray(long arr[]) {
        for (int i=0; i<arr.length; i++) arr[i]=nextLong();
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
    public static <T> void printArray(T []arr){
        for(int i=0;i<arr.length;i++) print(arr[i]);
    }
    public static void printArray(long []arr){
        for(int i=0;i<arr.length;i++) print(arr[i]);
    }
    public static void printArray(int []arr){
        for(int i=0;i<arr.length;i++) print(arr[i]);
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
    public static <T> void printlnArray(T []arr){
        printArray(arr);
        println();
    }
    public static void printlnArray(int []arr){
        printArray(arr);
        println();
    }
    public static void printlnArray(long []arr){
        printArray(arr);
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


