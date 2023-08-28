// Problem: A. Ultra-Fast Mathematician
// Contest: Codeforces - Codeforces Beta Round 57 (Div. 2)
// URL: https://codeforces.com/problemset/problem/61/A
// Memory Limit: 256 MB
// Time Limit: 2000 ms
// 
// Powered by CP Editor (https://cpeditor.org)
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String a = reader.next();
        String b = reader.next();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(i))
             sb.append('0');
            else
             sb.append('1');
        }
        System.out.println(sb.toString());
    }
    
    // Other methods here
}