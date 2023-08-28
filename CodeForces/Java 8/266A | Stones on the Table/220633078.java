// Problem: A. Stones on the Table
// Contest: Codeforces - Codeforces Round 163 (Div. 2)
// URL: https://codeforces.com/problemset/problem/266/A
// Memory Limit: 256 MB
// Time Limit: 2000 ms
// 
// Powered by CP Editor (https://cpeditor.org)
 
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 Scanner reader = new Scanner(System.in);
 long num = reader.nextInt();
 
 String stones = reader.next();
 int count =1;
 for (int i=1;i<stones.length();i++) {
     if(stones.charAt(i-1)!=stones.charAt(i)){
      count++;
     }
 }
 
 System.out.println(num-count);
 
    }
 
    // Other methods here
}