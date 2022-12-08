






import com.library.ds.graph.flow.Dinic;

import java.util.*;
import java.io.*;
public class Main {

    static Boolean isTakeTestCase=false;
    FastScanner scanner;
    Printer out;
    Main(){
        scanner=new FastScanner();
    }
    public static void main(String[] args) throws Exception {
        Main solution=new Main();
        solution.solve();
    }


    void solve() throws Exception {
        out=new Printer();
        int t=1;
        if(isTakeTestCase) t=scanner.nextInt();
        for(int i=0;i<t;i++){
            solve(out,i);
        }
        out.out.close();
    }

    void solve(Printer out,int testcase) throws Exception{
        Dinic.howToUse();
    }


    static class FastScanner {
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
    static class Printer{
        public PrintWriter out;
        public Printer(){
            this.out=new PrintWriter(System.out);
        }
        public void print(Object o1){
            out.print(o1+" ");
        }
        public void print(Object o1,Object o2){
            out.print(o1+" "+o2+" ");
        }
        public void print(Object o1,Object o2,Object o3){
            out.print(o1+" "+o2+" "+o3+" ");
        }
        public void print(Object o1,Object o2,Object o3,Object o4){
            out.print(o1+" "+o2+" "+o3+" "+o4+" ");
        }
        public void printList(ArrayList<?> lst){
            lst.forEach((elem)->print(elem));
        }
        public <T> void printArray(T []arr){
            for(int i=0;i<arr.length;i++) print(arr[i]);
        }
        public void printArray(long []arr){
            for(int i=0;i<arr.length;i++) print(arr[i]);
        }
        public void printArray(int []arr){
            for(int i=0;i<arr.length;i++) print(arr[i]);
        }

        public void printReject(){
            print(-1);
        }
        public void printYESNO(boolean b){
            if(b) print("YES");
            else print("NO");
        }
        public void printYesNo(boolean b){
            if(b) print("Yes");
            else print("No");
        }
        public void printyesno(boolean b){
            if(b) print("yes");
            else print("no");
        }
        public void println(){
            out.println();
        }
        public void println(Object o1){
            out.println(o1);
        }
        public void println(Object o1,Object o2){
            out.println(o1+" "+o2);
        }
        public void println(Object o1,Object o2,Object o3){
            out.println(o1+" "+o2+" "+o3);
        }
        public void println(Object o1,Object o2,Object o3,Object o4){
            out.println(o1+" "+o2+" "+o3+" "+o4);
        }
        public void printlnList(ArrayList<?> lst){
            printList(lst);
            println();
        }
        public <T> void printlnArray(T []arr){
            printArray(arr);
            println();
        }
        public void printlnArray(int []arr){
            printArray(arr);
            println();
        }
        public void printlnArray(long []arr){
            printArray(arr);
            println();
        }
        public void printlnYESNO(boolean b){
            printYESNO(b);
            println();
        }
        public void printlnYesNo(boolean b){
            printYesNo(b);
            println();
        }
        public void printlnyesno(boolean b){
            printyesno(b);
            println();
        }
        public void printlnReject(){
            printReject();
            println();
        }
    }
}




