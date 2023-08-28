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
        char[] a = reader.next().toCharArray();
        char[] b = reader.next().toCharArray();
        
        for(int i=0;i<a.length;i++){
       System.out.print((a[i]-'0')^(b[i]-'0'));   
        }
    }
    
    // Other methods here
}