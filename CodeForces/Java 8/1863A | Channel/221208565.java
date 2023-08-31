// Problem: A. Channel
// Contest: Codeforces - Pinely Round 2 (Div. 1 + Div. 2)
// URL: https://codeforces.com/contest/1863/problem/A
// Memory Limit: 256 MB
// Time Limit: 1000 ms
// 
// Powered by CP Editor (https://cpeditor.org)
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
 
    int t = sc.nextInt();
 
    for (int i = 0; i < t; i++) {
      int n = sc.nextInt();
      int a = sc.nextInt();
      int q = sc.nextInt();
 
      String s = sc.next();
 
      int maybe = a;
      int current = a;
 
      boolean all = current == n;
 
      for (char c : s.toCharArray()) {
        if (c == '+') {
          ++maybe;
          ++current;
        } else {
          --current;
        }
 
        if (current == n)
          all = true;
      }
      System.out.println(all ? "YES" : maybe >= n ? "MAYBE" : "NO");
    }
    }
    
    // Other methods here
}